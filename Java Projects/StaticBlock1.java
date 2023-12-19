class test
{
  static 
  {
    System.out.println("block 1");
  }
  static
  {
    System.out.println("block 2");
  }
}
class StaticBlock1
{
  public static void main(String[] args) {
    System.out.println("main");
    test t=new test();
  }
}