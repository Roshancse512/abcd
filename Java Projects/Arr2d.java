public class Arr2d {
public static void main(String[] args) {
  int A[][]=new int[5][5];

  int B[][]={{1,2,3},{2,4,6},{1,3,5}};
  
  // int c[][];
  // c=new int[3][4];

  // int[][] d = new int[5][5];

  // int [] e,f[]; // here the e is an 1d array and F is consider as the @d Array
  // e=new int[3];
  // f=new int[4][5];
   
  // int [] i,j,k,l;//here all those are the 1d array
  for(int i=0;i<B.length;i++)
  {
    for(int j=0;j<B[i].length;j++)
    {
      System.out.print(B[i][j]+"");
    }
    System.out.println("");
  }
  System.out.println("using for each");
  for(int x[]:B)
  {
    for(int y:x)
    {
      System.out.print(y+"");
    }
    System.out.println("");
  }
  // Jagged array
  int a1[][];
  a1=new int [5][];
  a1[0]=new int[1];
  a1[1]=new int[2];
  a1[2]=new int[3];
  a1[3]=new int[4];
  a1[4]=new int[5];
  for(int i=0;i<a1.length;i++)
  {
    for(int j=0;j<a1[i].length;j++)
    {
      System.out.print(a1[i][j]+"");
    }
    System.out.println("");
  }
}  
}
