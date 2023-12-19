public class ArrSc4 {
  public static void main(String[] args) {
    int a[]={10,5,4,78,98};
    int max1=a[0];
    int max2=a[0];
    System.out.println("Second largest element");
    for(int i=0;i<a.length;i++)
    {
      if(a[i]>max1)
      {
        max2=max1;
        max1=a[i];
      }
      // else if(a[i]>max2)
      // {

      // }
    } 
    System.out.println(max2);
}
}