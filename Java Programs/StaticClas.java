class Outer
{
  static int a=10;
  int b=20;
 static class Inner
  {
    public void InnerDisplay()
    {
      System.out.println(a);
      // System.out.println(b);
    }
  }
}
class StaticClas
{
  public static void main(String[] args) {
    Outer.Inner OI=new Outer.Inner();
    OI.InnerDisplay();
  }
}