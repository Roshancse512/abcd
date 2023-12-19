public class Pal {
  public static void main(String[] args) {
    int f1=0,f2=1,f3,n=30;
    do{
      f3=f1+f2;
      f1=f2;
      f2=f3;
      System.out.println(f3);
    }while(f3<=n);
  
    
  }
  
}
