public class MethodVarray 
{
  static void show(int ...A)
  {;
    for(int x:A )
    {
      System.out.printf(" "+x);
    }
    System.out.println("\n");
  }
  
  static void ShowList(String ...str)
  {
    for(int i=0;i<str.length;i++)
    {
      System.out.println(" "+str[i]);
    }
    System.out.println("\n");
  }
  static void ShowList1(int start,String ...str)
  {
    for(int i=0;i<str.length;i++)
    {
      System.out.println(start+" "+str[i]);
      start++;
    }
  }
  public static void main(String[] args) {
    show(10,20,30,40,50,60);
    show(new int[]{10,20,30,40,50});
    ShowList("roshan","prasad","yarramsetti");
     ShowList1(6,"roshan","prasad","yarramsetti");
  }
}
