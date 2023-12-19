public class StaticBlock {
  static
  {
    int a=5, b=10;
      System.out.println(a+b);
  }
  static
  { 
    System.out.println("block 2");
  }
  static
  {
    System.out.println("block 3");
  }
   static
  {
    System.out.println("block 4");
  }
   static
  {
    System.out.println("block 5");
  }
   static
  {
    System.out.println("block 6");
  }
  public static void main(String[] args) {
    System.out.println("main");
  }
}
