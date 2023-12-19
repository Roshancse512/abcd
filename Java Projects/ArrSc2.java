import java.util.Scanner;
public class ArrSc2 {
  public static void main(String[] args) {
    int a[] = {10,20,30,40,50};
    int temp=-1;
    System.out.println("enter the elemnt are");
    for(int i=0;i<a.length;i++)
    {
      System.out.println(a[i]);
    }
    Scanner sc =new Scanner(System.in);
    System.out.println("enter a elements");
    int key=sc.nextInt();
    for(int i=0;i<a.length;i++)
    {
      if(key==a[i])
      {
        temp=i;
        break;
      }
    }
    if(temp==-1)
    {
      System.out.println("element not found");
    
      }
    else
    {
      System.out.println("element found at postion "+temp);
    }
   
    sc.close();
  }
  
}
