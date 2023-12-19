class std
{
  public int m1,m2,m3,rollno;
  public String name;
  public int marks()
  {
      return m1+m2+m3;
  }
  public float avg1()
  {
    float avg=m1+m2+m3/3;
    return avg;
  }
  public String grade()
  {
    if(avg1()==100)
    return "good";
    else
    return "need more to learn";

  }
  public void details(String name,int rollno)
  {
    System.out.println(name+" "+rollno);
  }
}
class Cls2
{
  public static void main(String[] args) {
    std s =new std();
    s.m1=10;
    s.m2=20;
    s.m3=30;
    s.details("roshan", 512);
    System.out.println(s.marks());
    System.out.println(s.avg1());
    System.out.println(s.grade());
  }
}