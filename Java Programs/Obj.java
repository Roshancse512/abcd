import java.lang.*;
class a
{
  int price;
  String model;
 public String toString()
 {
  return "model"+model+"Price"+price;
 }
class b{

}
}
class Obj
{
  public static void main(String[] args) {
    a A=new a();
    System.out.println(A.hashCode());
    A.model="Mac Book";
    A.price=10000;
    System.out.println(A);
    b B=new b();
    System.out.println(B.equals(A));
    System.out.println(B.toString());
  }
}