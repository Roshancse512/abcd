// Sleep the thread
class a implements Runnable
{
  public void run()
  {
    for(int i=0;i<=10;i++)
    System.out.println("Music Playing");
      try 
      {
        Thread.sleep(200);
      } catch (InterruptedException e) 
      {
        e.printStackTrace();
      }
  }
}
class b implements Runnable
{
  public void run()
  {
    for(int i=0;i<=10;i++)
    System.out.println("Car Driving");
    try
    {
      Thread.sleep(10);
    }
      catch(InterruptedException e)
    
    {
      e.printStackTrace();
    }
  }
}
class thread5
{
  public static void main(String[] args) {
    Runnable r=new a();
    Runnable r2=new b();

    Thread t1=new Thread();
    Thread t2=new Thread(r2);
    // t2.setPriority(10);
    

    t1.start();
    t2.start();
  }
}