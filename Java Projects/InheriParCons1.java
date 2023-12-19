class parent
{
  public int length;
  public int breadth;
  parent()
  {
    System.out.println("parent");
  }
  public parent(int l,int b)
  {
    length=l+1;
    breadth=b;
  }
}
class child extends parent
{
  int height;
  child()
  {
    System.out.println("child");
  }
  public child(int l,int b,int h)
  {
    super(l,b);
    height=h;
    
  }
  public int add()
  {
    return height*length*breadth;
  }

}
class InheriParCons1
{
  public static void main(String[] args) {
    child c=new child(20, 30, 40);
    System.out.println(c.add());
  }
}