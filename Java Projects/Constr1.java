import java.util.Scanner;
class subject
{
  private int id;
  private String name;
  private int maxMarks;
  private int marksObtain;
  public subject(int id,String name,int maxMarks,int marksObtain)
  {
      this.id=id;
      this.name=name;
      this.maxMarks=maxMarks;
      this.marksObtain=marksObtain;
  }
  public subject() {
  }
  public int getid()
  {
    return id;
  }
  public String getname()
  {
    return name;
  }
  public int getmaxmarks()
  {
    return maxMarks;
  }
  public int getmarksob()
  {
    return marksObtain;
  }
  public void setid(int i)
  {
    id=i;

  }
  public void setname(String s)
  {
    name=s;
  }
  public void setmaxmarks(int m)
  {
    maxMarks=m;
  }
  public void setmarksob(int m1)
  {
    marksObtain=m1;
  }
  public String toString()
  {
    return "\nid "+id+"\n"+name+"\n"+maxMarks+"\n"+marksObtain;
  }
}

class Constr1
{
  public static void main(String[] args) {
    subject a =new subject(101, "C++", 100, 90);
    System.out.println(a.toString());
    subject a1=new subject();
    int size1;
    Scanner sc=new Scanner(System.in);
    size1=sc.nextInt();
    a1.setid(size1);
    a1.setname("Java");
    a1.setmaxmarks(100);
    a1.setmarksob(80);
    System.out.println("id:"+a1.getid()+" "+"name:"+a1.getname()+" "+"maxmarks:"+a1.getmaxmarks()+" "+"maxobtain:"+a1.getmarksob());
    subject a3[]=new subject[2];
    a3[0]=new subject(103,"Network",100,85);
    System.out.println(a3[0].toString());
    a3[1]=new subject(104,"C#",100,95);
    System.out.println(a3[1].toString());
    sc.close();
  }
}