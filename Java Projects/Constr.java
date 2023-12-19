class rect
{
  private String name;
  private int age;
  public rect()
  {
    name="Roshan";
    age=21;
  }
  public rect(String s,int a)
  {
    age=a;
    name=s;
  }
  public rect(String s)
  {
    name=s;
    age=20;
  }
  public int getage()
  {
    return age;
  }
  public String getname()
  {
    return name;
 }
}
class Constr{
  public static void main(String[] args) {
    rect a=new rect();
    System.out.println("name:"+a.getname()+"age"+a.getage());
    rect a1=new rect("Rocky",20);
    System.out.println("name:"+a1.getname()+"age:"+a1.getage());
    rect a2=new rect("prasad");
    System.out.println("name:"+a2.getname()+"age:"+a2.getage());

    
  }
}