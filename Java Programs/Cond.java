
import java.util.Scanner;
public class Cond {
  public static void main(String[] args) 
  {
      int x,y;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter x and y values");
      x=sc.nextInt();
      y=sc.nextInt();
      if(x>y)
      {
        System.out.println("x is large");
      }
      else{
        System.out.println("Y is large");
      }
      sc.close();
       
  
}
}