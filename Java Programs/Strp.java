import java.util.Scanner;
public class Strp {
  public static void main(String[] args) {
    String str="  Roshan  ";
    String str2= new String("Prasad");

    // String Methods
    //  length
      System.out.println(str2.length()); 

      int len= str.length();

      System.out.println(len);

      // upper case and lower case
      // String str1 =str2.toUpperCase(); it convert the str2 into upper case then the letters are stored in a garbbage collector after that it chnages ti upper 
     str2 =str2.toUpperCase();
      System.out.println(str2 );

      // to capatalize the first letter
      String st=str2.substring(0, 1).toLowerCase();
      System.out.println(st+str2.substring(1));
     
     
      str=str.toLowerCase();
      System.out.println(str); 

      // Trim
      str=str.trim();
      System.out.println(str);

      // Substring
      str=str.substring(2);
      System.out.println(str);

      str2=str2.substring(3, 6);
      System.out.println(str2);

      // Replace

      String str3=str2.replace('S','M');
      System.out.println(str3);

      //Starts with
      String str5="Mr. Pawan Kalyan";
      System.out.println(str5.startsWith("Mr"));
      System.out.println(str5.endsWith("Kalyan"));
      System.out.println(str5.startsWith("Pa",4));

      // CharAt
      System.out.println(str5.charAt(4));

      // to print total string
      for(int i =0;i<str5.length();i++)
      {
      System.out.print(str5.charAt(i));
      }  
      System.out.println("\n");

      // index of 

      String str6= "www.google.com";
      System.out.println(str6.indexOf("."));
      int length=str6.indexOf("o",7);
      System.out.println(length);//if the char not found in the string it returns the -1 as a o/p
      System.out.println(str6.lastIndexOf('l')); //it checks the string from end to start
      System.out.println(str6.lastIndexOf(".", 4));
  
      // Equals
      String str7="Java";
      String str8="java";
      System.out.println(str7.equals(str8));
      System.out.println(str7.equalsIgnoreCase(str8));
      String str9= new String("Java");
      System.out.println(str7==str9);
      System.out.println(str7.equals(str9));

      // Compare the strings
      System.out.println(str7.compareTo(str9));//when the 2 strings are equal then the it returns the 0 if the string is in captial letter then it returns the + numbers otherwise -negative numbers


      String str10="Power Star";
      String str11="Pawan kalyan";
      //concat the string
      System.out.println(str10+"\t"+str11);
      System.out.println(str10.concat(str11));

      // contains
      System.out.println(str10.contains("Power"));

      // value of
      int s1=10;
      String s=String.valueOf(s1);
      System.out.println(s);

      // Reading input from user
      String str12;
      Scanner st1=new Scanner(System.in);
      str12=st1.nextLine();
      System.out.println(str12);

      st1.close();
    }
    
  
}
