// Math methdos 

public class MathP {
  public static void main(String[] args) {
    System.out.println( " it give the absolute value");
    System.out.println(Math.abs(-499));

    System.out.println("It was a strict maths abs");
    System.out.println(StrictMath.abs(-96));

    System.out.println("it give the cube root of 10");
    System.out.println(Math.cbrt(10));

    System.out.println("it give the decrement of the below value");
    System.out.println(Math.decrementExact(10));

    System.out.println("it give the expoenet value");
    System.out.println(Math.getExponent(10));

    System.out.println("it gives the radius of the value");
    System.out.println(Math.toRadians(20));

    System.out.println("it gives the floor div of the value");
    System.out.println(Math.floorDiv(50, 9));

    System.out.println("it gives the exponent value");
    System.out.println(Math.exp(200));

    System.out.println("it gives the log value");
    System.out.println(Math.log(10));

    System.out.println("it gives the max of the values");
    System.out.println(Math.max(20, 50));

    int randomNumber = (int) (Math.random() * 200);
System.out.println("Random Number: " + randomNumber);

    System.out.println("it gives the power of the values");
    System.out.println(Math.pow(20, 2));

    System.out.println("it give the multiply exact values");
    System.out.println(Math.multiplyExact(200, 300));

    System.out.println("it gives the next number of the blow number");
    System.out.println(Math.nextAfter(20, 20.1));


  }
  
}
