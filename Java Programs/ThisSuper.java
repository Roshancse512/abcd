class a 
{
  public a()
  {
    super();
    System.out.println("in a");

  }
  public a(int a)
  {
    super();
    System.out.println("in a int");
  }
}
class b extends a
{
  public b()
  {
    super();
    System.out.println("in b");
  }
  public b(int a)
  {
    this();    
    System.out.println("in b int");
  }
}
class ThisSuper
{
  public static void main(String[] args) {
    b B=new b(10);
    // System.out.println(b);
    
  }
}
