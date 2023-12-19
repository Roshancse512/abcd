public class ArrSC2d {
  public static void main(String[] args) {
    int c[][]=new int[3][3];
    int a[][]={{1,2,3},{4,5,6},{7,8,9}};
    int b[][]={{7,8,9},{4,5,6},{3,2,1}};
// Additinon
    // for(int i=0;i<3;i++)
    // {
    //   for(int j=0;j<3;j++)
    //   {
    //     c[i][j]=a[i][j]+b[i][j];
    //     System.out.print(c[i][j]+"");
    //   }
    //   System.out.println("");
      
    // }
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
      {
        c[i][j]=a[i][j]-b[i][j];
        System.out.print(c[i][j]+"");
      }
      System.out.println("");
      
    }
    
  }
  
}
