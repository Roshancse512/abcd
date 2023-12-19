public class ArrSc3 {
  public static void main(String[] args) {
    int a [] = {50,6,88,70,9,8};
    int max=a[0];
    int min=a[0];
    System.out.println("the largest element is");
    {
    for(int i =0; i<a.length;i++)
    {
        if(max<a[i])
        {
        
          max=a[i];
        }
    }
    System.out.println(max);
  }
  System.out.println("the Smallest element is");
    for(int i =0; i<a.length;i++)
    {
        if(min>a[i])
        {
          min=a[i];
        }
    }
    System.out.println(min);
  }
  
}
