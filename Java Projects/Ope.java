public class Ope {
  public static void main(String[] args) {
    // Operators

    //  Arthimetic Operators
    int a=10;
    int b=5;

    int result= a % b;
    int result2=a+b;
    int result3=a- b;
    int result4=a*b;
    int result5=a/b;
    System.out.println(result);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(+result5+ "\n");
    // System.out.println(result);


    int c=7;

    // Assignment Opeators

    c +=2;
    System.out.println(c);
    c -=2;
    System.out.println(c);
    c /=2;
    System.out.println(c);
    c%=2;
    System.out.println(+c+ "\n");

    // Increment Opeators

    int d=20;
    int e=25;

    d++;
    System.out.println(d); //increment
    e--;
    System.out.println(+e+"\n");   //Decrement

    int  f=30;

    // int op= ++f; //pre increment it fetch the value and then perform the increment
    // System.out.println(op); 

    int op =f++; // post increment it increment the value and thefetch the value
    System.out.println(+op+"\n");

    // Realtional operators
     
    int g=10;
    int h=50;

    boolean rlt= g>h;
    System.out.println(rlt);

    boolean rlt1= g<h;
    System.out.println(rlt1);
    
    boolean rlt2= g>=h;
    System.out.println(rlt2);

    boolean rlt3= g<=h;
    System.out.println(rlt3);

    boolean rlt4=g==h;
    System.out.println(rlt4);

    boolean rlt5=g!=h;
    System.out.println(rlt5+"\n");

    // Logical Operators
    int i=7;
    int j=5;
    int k=5;
    int l=9;

   boolean re = i > j && k < l;
    System.out.println(re);

    boolean re1 = i < j || k < l;
    System.out.println(re1);

    boolean re2= j<i ;
    System.out.println(!re2);

    



      }
  
}
