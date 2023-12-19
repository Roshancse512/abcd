import java.util.Scanner;
public class Condeif 
{
  public static void main(String[] args) {
    int a,b,c;
    Scanner st = new Scanner(System.in);
    System.out.println("Enter the a,b,c values");
    a=st.nextInt();
    b=st.nextInt();
    c=st.nextInt();
    if(a>=b)
    {
      if(a>=c)
      {
        System.out.println("a is big"+a);
      }
      else
      {
        System.out.println("c is big"+c);
      }
    }
    else
    {
        if(b>=c)
        {
          System.out.println("b is big"+b);
        }
        else{
          System.out.println("c is big"+c);
        }
      }
      st.close();
    }
  }

