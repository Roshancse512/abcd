abstract class shape
{
  abstract double perimeter();
  abstract double area();
}
class circle extends shape
{
  double radius;
  public double area( )
  {
      return Math.PI*radius*radius;
  }
  public double perimeter( )
  {
    return 2*Math.PI*radius*radius;
  }
  
}
class rect extends shape
{
  double length,width;
  public double area()
  {
      return length*width;
  }
  public double perimeter()
  {
    return 2*length*width;
  }

}
class AbstSc 
{
  public static void main(String[] args) {
    circle c=new circle();
    c.radius=20;
    System.out.println(c.area());
    System.out.println(c.perimeter());
    rect r=new rect();
    r.length=30;
    r.width=60;
    System.out.println(r.area());
    System.out.println(r.perimeter());
  }
}