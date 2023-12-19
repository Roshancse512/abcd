public class Arr1d {
  public static void main(String[] args) {
    int A[]=new int[10];
    int B[]={10,15,20,25,30};

    int C[];
    C=new int[10];

    // int[]  D = new int[10];


// Changing the value
    B[2]=15;

    // Printing the array values
    for(int i=0;i<B.length;i++)
    {
      System.out.println(B[i]++);
    }

    // Printing values after the increment
    for(int x:B)
    {
      System.out.println(x);
    }

    // Printing the size of the array
    System.out.println(A.length);

  }
  
}
