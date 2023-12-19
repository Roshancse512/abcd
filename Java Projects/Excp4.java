class a
{
  public double area(int l,int b) throws Exception
  {
    if(l==0 || b==0)
    throw new Exception();
    return l*b;
  }
  public  void meth1()throws Exception
  {
    System.out.println(area(30, 0));
      
  }
}
class Excp4{
  public static void main(String[] args) {
    a A=new a();
    try{
    A.meth1();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
    
  }
}