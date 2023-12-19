import java.util.Scanner;

public class Mathp1 {
  public static void main(String[] args) {
    int a;
    Scanner st= new Scanner(System.in);
    System.out.println("enter a number");
    a=st.nextInt();
    int rad= (int) Math.random()*200;

      for(int i=rad;i==a;i++)
      {
        if(a==i)
        { 
            System.out.println("UR win"+rad);
        }
        else
        {
            System.out.println("ur lose"+rad);
        }
    }
    st.close();
  }
  
}
