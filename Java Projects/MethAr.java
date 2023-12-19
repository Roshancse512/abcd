public class MethAr {
 static int Max(int A[])
  {
    int max=A[0];
    for(int i=0;i<A.length;i++)
    {
      if(A[i]>max)
      {
        return A[i];
      }
      
    }
    return max;

  }
  public static void main(String[] args) {
    int a[]={20,50,40,6,9};
    int i=Max(a);
    System.out.println(i);
    
  }
  
}
