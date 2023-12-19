// polymorphsim is two types the first one is run time polymorphism and second one is runtime polymorphism 
// poly --> many
// morphism --> behaviour
// compile time --> method overloading
// runtime time -->method overriding also called as dynamic method dispatch
class a
{
  public void show()
  {
    System.out.println("in A");
  }
}
class b extends a
{
  public void show()
  {
    System.out.println("in B");
  }
}
class c extends a
{
  public void show()
  {
    System.out.println("in C");
  }
}
class Poly 
{
  public static void main(String[] args) {
    a obj=new a();
    obj.show();

    obj=new b();
    obj.show();

    obj=new c();
    obj.show(); 
  }
}