interface A
{
  void car();
  void bike();
}
interface B extends A
{


  void cycle();
}
class C implements B
{
    public int a,b;
  public void car() 
  { 
       
      System.out.println("car");  
  }


  public void bike()
  {
      System.out.println("bike");
  }

  
  public void cycle()
  {
      System.out.println("cycle");
  }
  
}
class Inter2 
{
  public static void main(String[] args) {
    B obj =new C();
    obj.bike();
    obj.car();
    obj.cycle();
    
  }
}