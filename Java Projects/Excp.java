import java.util.Scanner;

class Excp
{
  public static void main(String[] args) {
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the a and b values");
    a=sc.nextInt();
    b=sc.nextInt();
    try
    {
        int c=a/b;
        System.out.println(c);
    }
    catch(Exception e)
    {
       System.out.println("divied by zero"+e);
    }
    System.out.println("bye");
    System.out.println("end of pg");
  }
}