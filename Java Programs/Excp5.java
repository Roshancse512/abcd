class A
{
  public void show() throws ClassNotFoundException
  {
    Class.forName("qwerty");
  }
}
public class Excp5
{
  static{
    System.out.println("class loading....");
  }
  public static void main(String[] args) throws ClassNotFoundException {
    A a=new A();
    try
    {
      a.show();
    }
    catch(Exception a1)
    {
      System.out.println(a1);
    }
    finally
    {
      System.out.println("Class Not Found");
    }
    
  }
}