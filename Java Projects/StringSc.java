import java.util.Scanner;
public class StringSc {
  public static void main(String[] args) {
   String str1;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter gmail");
   str1=sc.nextLine();
  if(str1.matches("\\w*@gmail(.*)*"))
  {
    System.out.println("vaild");
  }
  int i=str1.indexOf("@");
   
  String uname=str1.substring(0,i);
  String domain=str1.substring(i+1,str1.length());

  System.out.println("username: "+uname);
  System.out.println("domain: "+domain);

  int j=domain.indexOf(".");
  String name=domain.substring(0, j);
  System.out.println(name.equals("gmail"));
  sc.close();
  }
  
}
