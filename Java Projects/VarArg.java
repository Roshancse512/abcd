public class VarArg {

  static int Max(int ...A)
  { 
    int m=A[0];
    if(A.length==0) return Integer.MIN_VALUE;
       
    for(int i=1;i<A.length;i++)
    if(A[i]>=m) m=A[i];
    return m;
  }
  public static void main(String[] args) {
   System.out.println( Max(20,30,40,50,80));
   try{

   System.out.println( Max());
   }
   catch(ArrayIndexOutOfBoundsException a)
   {
    System.out.println("no elements");

   }
   System.out.println("ending");
  }
}

