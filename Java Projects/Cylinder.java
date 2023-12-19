import java.util.Scanner;

public class Cylinder {
  public static void main(String[] a) {
    double area,vol,r,h;
   // double Pi=3.14;
    Scanner se=new Scanner(System.in);
    System.out.println("\'Enter r\'");
    r = se.nextDouble();
    System.out.println("\'enter h\'");
    h =se.nextDouble();
    area = 2 * Math.PI * r*(r+h);
    System.out.printf("\"area of cylinder %f \" \n",area);
    vol = Math.PI * r * r * h;
    System.out.printf("\"Volume of Cylinder %f \"",vol);
    se.close();

    
  }  
}
