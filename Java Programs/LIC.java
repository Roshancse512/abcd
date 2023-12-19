class Outer
{
  void OuterDisplay()
  {
    class Inner
    {
    
      void InnerDisplay()
      {
        System.out.println("hello world");
      }
    }
    Inner i =new Inner();
    i.InnerDisplay();
  }
}
class LIC
{
  public static void main(String[] args) {
    Outer O=new Outer();
    O.OuterDisplay();
  }
}