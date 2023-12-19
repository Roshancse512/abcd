 class parent
{
  public parent()
  {
    System.out.println("parent cons");
  }
}
class child extends parent
{
  public child()
  {
    System.out.println("child cons");
  }
}
class grandchild extends child
{
  public grandchild()  
  {
    System.out.println("grand child");
  }
}
class inheriCons
{
  public static void main(String[] args) {
    grandchild g=new grandchild();
  

  }
}