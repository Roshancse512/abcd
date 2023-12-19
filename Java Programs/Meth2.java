public class Meth2 {


  static void update(int a[],int index,int value)
  {
    a[index]=value;
  }
  static void update2(int x,int value)
  {
    x=value;
  }
  public static void main(String[] args) {
    int a[]={2,4,6,8,10};
    update(a, 2, 50);
    for(int x :a)
    {
      System.out.println(x);
    }
    int x=20;
    update2(x,40);
    System.out.println("x="+x);
  }
}
