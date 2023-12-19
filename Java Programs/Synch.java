class Cust{
  int amount=10000;
  synchronized void withdraw(int amount)
  {
    System.out.println("going for withdraw");
    if(this.amount<amount)
    {
      System.out.println("low amount wait for depoist");
      try{
        wait();
      }
      catch(Exception e)
      {}
    }
    this.amount-=amount;
  }
    synchronized void depoist(int amount)
    {
      System.out.println("depoisting");
      this.amount+=amount;
      notify();

    }
  }
  class synch 
  {
    public static void main(String[] args) {
      Cust c=new Cust();
     new Thread(){
      public void run()
      {
        c.withdraw(20000);
      }
     }.start();
     new Thread(){
      public void run()
      {
        c.depoist(2000);
      }
    }.start();
  }
}
