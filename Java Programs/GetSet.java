class sq{
  private double length;
  private double breadth;
  public  double getLength()
  {
    return length;
  }
  public double getBreadth()
  {
    return breadth;
  }
  public void setLength(int l)
  {
      
      if(l>=0)
      length=l;
      else
      length =0;

  }
  public void setBreadth(int b)
  {
    if(b>=0)
    breadth=b;
    else
    breadth=0;
  }
  public double area()
  {
    return Math.PI*getLength()*getBreadth();
  }
  public double perimeter()
  {
    return 2*breadth;
  }
  public boolean sqr()
  {
    if(length==breadth)
    return true;
    else
    return false;
  }

}
class GetSet
{
  public static void main(String[] args) {
    sq s=new sq();
    s.setLength(10);
    s.setBreadth(10);
    System.out.println(s.getLength());
    System.out.println(s.getBreadth());
    System.out.println(s.area());
   System.out.println( s.perimeter());
    System.out.println(s.sqr());
    
  }
}