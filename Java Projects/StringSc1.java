public class StringSc1 {

  public static void main(String[] args) {
    int b=1011001;
    String str=String.valueOf(b);
    if(str.matches("[01]+"))
    {
      System.out.println("Binary");
    }
    else
    {
      System.out.println("Not");
    }
    String str2="ABC4RF";

    if(str2.matches("[A-Z0-9]+"))
    {
      System.out.println("Hexadecimal");
    }
    String st3="10-05-2000";
    if(st3.matches("\\d{1,2}-\\d{1,2}-\\d{4}"))
    {
      System.out.println("in format");
    }
  }
}
