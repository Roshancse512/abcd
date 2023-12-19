public class Stringmatch {
  public static void main(String[] args) {
    String str1="abc";
    System.out.println(str1.matches("[abc]+"));
    System.out.println(str1.matches("[abc]*"));
    System.out.println(str1.matches("[abc]{3,7}"));
 
    String str2="rocky@gmail.com";
    System.out.println(str2.matches(".*gmail.*"));
    System.out.println(str2.matches("\\w*@gmail(.*)"));
  }
  
}
