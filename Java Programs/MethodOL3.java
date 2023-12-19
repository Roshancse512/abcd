class A
{
   void NameVal(String name)
  {
    if(name.matches("[a-zA-z\\s]+"))
    
      System.out.println("Vaild"); 
      else
      System.out.println("invaild");
  }
 void AgeVal(int age)
  {
    if( age>=3 && age<=100)
    System.out.println("vaild");
    else
    System.out.println("invaild");
  }
}
public class MethodOL3
{
  public static void main(String args[])
  {
    A name = new A();
    name.NameVal("Roshan");
    A age= new A();
    age.AgeVal(20);

  }
}