import java.util.Scanner;

public class Arr2 {
  public static void main(String[] args) {
    Scanner sm= new Scanner(System.in);
    System.out.println("enter size of array");
    int size=sm.nextInt();
    int a[]=new int[size];
    System.out.println("enter array elements");
    for(int i=0;i<a.length;i++)
    {
      a[i]=sm.nextInt();
    }
    System.out.println("enter number to be searched");
    int find=sm.nextInt();
    int index=-1;
    for(int i=0;i<size;i++)
    {
      if(a[i]==find)
      {
        index=i;
        break;
      }
    }
    if(index==-1)
    {
      System.out.println("Element is not found ");
    }
    else{
      System.out.println("element found at index of "+index);
    }
    sm.close();
  }
}
