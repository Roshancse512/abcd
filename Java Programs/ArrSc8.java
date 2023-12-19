public class ArrSc8 {
  public static void main(String[] args) {
    int a[]={10,20,30,40,50};
    int b[]=new int[a.length];
    for(int i=a.length-1;i>=0;i--)
    {
        b[a.length-1-i]=a[i];
        System.out.println(b[i]);
    }
  
  }
  
}
