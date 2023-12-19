public class Excp1 {
  public static void main(String[] args) {
    int a[]={10,20,30,40,0};
    try
    {
      try
      {
        int r=a[2]/a[4];
        System.out.println(r);
      }
      catch(ArithmeticException e)
      {
          System.out.println(e);
      }
      System.out.println(a[10]);
    }
    catch(ArrayIndexOutOfBoundsException e)
      {
        System.out.println(e);
      }
    }
  }