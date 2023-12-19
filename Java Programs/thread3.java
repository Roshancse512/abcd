// Thread with runnable interface with lamda expression
class thread3
{
  public static void main(String[] args) {
    Runnable r=()->
    {
        for(int i=0;i<=10;i++)
        System.out.println("roshan");
    };
    Runnable r1=()->
    {
      for(int i=0;i<=10;i++)
      System.out.println("prasad");
    };
    Thread t=new Thread(r);
    Thread t1=new Thread(r1);

    t.start();
    t1.start();
  }
}