class Cir
{
  public double radius;
  
  public double area()
  {
    return Math.PI*radius*radius;
  }
  public double perimeter()
  {
    return 2*Math.PI*radius;
  }
  public double circum()
  {
    return perimeter();
  }
}
class Cls 
{
  public static void main(String[] args) {
    Cir a=new Cir();
    a.radius=10;
    System.out.println("Area is :"+a.area());
    System.out.println("perimeter of cir:"+a.perimeter());
    System.out.println("circum is:"+a.circum());

    Cir b=new Cir();
    b.radius=20;
    System.out.println("\n");
     System.out.println("Area is :"+b.area());
    System.out.println("perimeter of cir:"+b.perimeter());
    System.out.println("circum is:"+b.circum());
    
  }
}