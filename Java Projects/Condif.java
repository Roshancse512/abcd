import java.util.Scanner;
public class Condif {
  public static void main(String[] args) {
    double pa,dis;
    Scanner se= new Scanner(System.in);
    System.out.println("enter bill");
    pa=se.nextDouble();
    if(pa>=1000)
    {
      dis=(pa*10)/100.0;
      System.out.println(dis);
      pa=pa-dis;
    }

    System.out.println("the bill " +pa);
      se.close();

  }

  
}
