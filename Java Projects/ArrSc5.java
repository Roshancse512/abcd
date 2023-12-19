public class ArrSc5 {
  public static void main(String[] args) {
    int a[]={5,9,6,10,12,7,3};
    for(int x:a)
    {
      System.out.print(x+",");
      System.out.println("");
    }
      int temp;
      temp=a[0];
      System.out.println("After rotating an array");
      for(int i=1;i<a.length;i++)
      {
        a[i-1]=a[i];
        
      }

      a[a.length-1]=temp;
      for(int x:a)
      {
      System.out.print(x+",");
      System.out.print("");
      }
    }
  }

