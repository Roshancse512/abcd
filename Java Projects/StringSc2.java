public class StringSc2 {
  public static void main(String[] args) {
    String str1=" abc def ghi jkl mno";
    String str2="AB$CD^#!";
    System.out.println(str1.replaceAll("\\s+", " ").trim());
    System.out.println(str2.replaceAll("[^a-zA-Z0-9]", " "));
  
    String words[]=str1.split("\\s");
    System.out.println(words.length);
  }

  
}
