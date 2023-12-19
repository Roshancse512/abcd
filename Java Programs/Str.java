public class Str {
  public static void main(String[] args) {
    String str1="Java";
    String str2="Java";

    char c[]={'h','t','m','l'};

    String str3 = new String(c);

    byte b[]={69,70,71,72};

    String str4 = new String(b,1,2);

    System.out.println(str1);
    System.out.println(str2);

    System.out.println(str3);

    System.out.println(str4);


    System.out.println(str1==str2);

    String str5 = new String("Java");

    System.out.println(str1==str5);
  }
  
}
