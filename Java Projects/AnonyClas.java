class test
{
 public void show()
  {
    System.out.println("hello ");
  }
}
class AnonyClas
{
  public static void main(String[] args) {
    test t=new test()
    {
      public void show()
      {
        System.out.println("hello  2");
      }
    };
    t.show();
  }
}