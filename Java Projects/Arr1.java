import java.util.Scanner;
public class Arr1 {
  public static void main(String[] args) 
  {
    int size;
    Scanner st=new Scanner(System.in);
    System.out.println("Enter Array Size");
    size=st.nextInt();
    int a[]=new int[size];
    System.out.println("Enter array Elements");
    for(int i =0;i<a.length;i++)
    {
      a[i]=st.nextInt();
    }
    System.out.println("enter elements are");
    for(int i=0;i<a.length;i++)
    {
      System.out.println(a[i]);
    }
    st.close();
  }
  
}
