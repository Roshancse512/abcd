// wihtout this keyword
class a{
  private int age;
  private String name;
  public int getage()
  {
    return age;
  }
  public void setage(int age,a obj)
  {
    a obj1=obj;
    obj1.age=age;
  }
  // with this keyword
  public String getname()
  {
    return  name;
  }
  public void setname(String name)
  {
    this.name=name;
  }
}
class This 
{
  public static void main(String[] args) {
    a obj=new a();
    obj.setage(30,obj);
    obj.setname("roshan");
    System.out.println(obj.getage()+"\n"+obj.getname());

  }
}