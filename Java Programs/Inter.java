interface A
{
  void show();
  void display();
}
class B implements A
{
   public void show()
   {
    System.out.println("show");
   }
  public void display()
   {
    System.out.println("display");
   }
}
class Inter 
{
  public static void main(String[] args) {
   A obj=new B();
   obj.show();
   obj.display();
   

  }
}
