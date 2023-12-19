// Creation of thread with runnable interface
class test implements Runnable
{
   public void run()
   {
          int i=0;
          while(i<=10)
          {
            System.out.println("Hello");
            i++;
          }
   }
  
}
class test1 implements Runnable
{
  public void run()
  {
    int i=0;
    while(i<=10)
    {
      System.out.println("world");
      i++;
    }
  }
}
class thread2
{
  public static void main(String[] args) {
    test t1=new test();
    test1 t2=new test1();

    Thread obj=new Thread(t1);
    Thread obj1=new Thread(t2);

    obj.start();
    obj1.start();
  }
}