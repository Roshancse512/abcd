import java.util.Scanner;
public class ArrSc {
  public static void main(String[] args) {
    int total=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of the array \n");
     int size=sc.nextInt();
    int[] A = new int[size];
    System.out.println("Enter the Elements in array \n");
    for(int i =0;i<size;i++)
    {
      A[i]=sc.nextInt();    
    }
    System.out.println("Total size of array elements are \n");
    
    // for(int i=0;i<A.length;i++)
    // {
    //   total=total+A[i];

    // }
    System.out.println(total);
    for(int x:A)
    {
      total=total+x;
    }
        System.out.println(total);


    sc.close();
  }
  
}
