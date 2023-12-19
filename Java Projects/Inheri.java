class circle
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
class cylinder extends circle
{
  public double length;
  public double height;
  public double vol()
  {
    return 2*length*height*area();
  }
}
class inheri
{
  public static void main(String[] args) {
    cylinder c=new cylinder();
    c.radius=10;
    c.length=20;
    c.height=50;
    System.out.println("area of ciricle"+c.area());
    System.out.println("volume of the cylinder"+c.vol());
  }
}