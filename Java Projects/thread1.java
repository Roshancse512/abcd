class test extends Thread{
  public void run()
  {
    for(int i=0;i<10;i++)
    System.out.println("Hello");

}
}
class test1 extends Thread
{
  public void run()
  {
    for(int i=0;i<10;i++)
    System.out.println("World");
  }
}
class thread1
{
  public static void main(String[] args) {
    test t1=new test();
    test1 t2=new test1();

    t1.start();
    t2.start();;
  }
}