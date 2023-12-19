// call by value and call by reference 
class a
{
  int a=10;
  int b=20;
  public int add(int a,int b)
  {
    int r=a+b;
    return r;
  }
 public  void sum(int g,int h)
  {
    System.out.println(g+h);
  }

}
class Callby
{
  public static void main(String[] args) {
    
    a ob=new a();
   System.out.println( ob.add(10,20));
   ob.sum(ob.a,ob.b);


  }
}