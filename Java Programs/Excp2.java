public class Excp2 {
  public static void main(String[] args) {
    int a[]={10,20,30,40,0,6};
    try
    {
      int r=a[0]/a[3];
      System.out.println(r);
      System.out.println(a[500]);
    }
    catch(ArithmeticException obj)
    {
      System.out.println(obj);
    }
    catch(ArrayIndexOutOfBoundsException obj)
    {
      System.out.println(obj);
    }
  }
  
}
