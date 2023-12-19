import java.util.Scanner;
public class Swic {
  public static void main(String[] args) {
    int a,b,c;
    Scanner st=new Scanner(System.in);
    System.out.println("enter a & b values");
    a=st.nextInt();
    b=st.nextInt();
    System.out.println("1.ADD 2.SUB 3.MUL 4.DIV 5.MOd");
    c=st.nextInt();
    switch(c)
    {
      case 1:System.out.println(a+b);
      break;
      case 2 :System.out.println(a-b);
      break;
      case 3:System.out.println(a*b);
      break;
      case 4 :System.out.println(a%b);
      break;
      case 5 : System.out.println(a/b);
      break;
      default :System.out.println("Invaild Option");
      break;

    }
    st.close();    
  }
}
