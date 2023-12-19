class a
{
  public  int meth1()
  {
    return 10/0;

  }
  public void meth2()
  {
    // try{
    meth1();
    // }
    // catch(Exception e)
    // {
    //   System.out.println(e.getMessage());
    // }
  }
  public void meth3()
  {
    meth2();
  }
}
class Excp3
{
  public static void main(String[] args) {
    a A=new a();
    try{
    A.meth3();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}