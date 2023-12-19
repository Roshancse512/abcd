import java.util.Scanner;
public class Swich {
  public static void main(String[] args) {
    char day;
    Scanner sm= new Scanner(System.in);
    day=sm.next().charAt(0);
    switch(day)
    {
      case 'M','m' -> System.out.println("Monday");
      case 'T','t' -> System.out.println("Tuesday");
      case 'W','w' -> System.out.println("Wednesday");
      default -> System.out.println("invaild");
                  

    }
    sm.close();
  }
  
}
