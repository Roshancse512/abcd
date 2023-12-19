class Outer
{ 
  int x=10;
  Inner i1=new Inner();
  
  class Inner
  {
    int y=20;
    public void InnerDisplay()
    {
      System.out.println(x+" "+y);
    }
  }
  void OuterDisplay()
  {
    Inner i=new Inner();
    System.out.println(i.y);
    i.InnerDisplay();
  }
}
class Ineercls
{
  public static void main(String[] args) {
    Outer o=new Outer();
    o.OuterDisplay();

    Outer.Inner OI=new Outer().new Inner();
    OI.InnerDisplay();
  }
}