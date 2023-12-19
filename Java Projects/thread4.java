class a implements Runnable
{
  public void run()
  {
    int i=0;
    while(i<10)
    {
      System.out.println("Hello");
      i++;
    }
  }
}
class b implements Runnable
{
  public void run()
  {
    int i=0;
    while(i<=10)
    {
      System.out.println("Bye");
      i++;
    }
  }
}
class thread4
{
  public static void main(String[] args) {
    a A=new a();
    b B=new b();

    Thread t1=new Thread(A);
    Thread t2=new Thread(B);

    t1.setPriority(10); 
    //i'll give highest priority to the the thread t1 so that's why it get first excuted by the schedular
    t1.setPriority(Thread.MAX_PRIORITY);
    System.out.println(t1.getPriority());
    t1.start();
    t2.start();

  }
}