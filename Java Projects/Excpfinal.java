class A
{
  public void div(int a,int b)
  {
    try{
    int c=a/b;
    }
    catch(Exception ae)
    {
      System.out.println(ae.getMessage());
    }
    finally{
      System.out.println("out of block");
    }
    
  }
}
class Excpfinal
{
  public static void main(String[] args) {
    A a=new A();
    a.div(20, 0);
  }
}