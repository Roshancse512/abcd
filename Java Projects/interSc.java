interface member
{
  void callback();
}
class store
{
  member members []=new member[10];
  int count=0;
  
  void register(member m)
  {
    members[count++]=m;
  }
  void invitesale()
  {
    for(int i=0;i<count;i++)
    members[i].callback();
  }
}
class cust implements member
{
  String name;
  cust(String n)
  {
    name=n;
  }
  public void callback()
  {
    System.out.println("ok,i will visit"+name);
  }
}
public class interSc 
{
  public static void main(String[] args) {
    store s=new store();
    cust c1=new cust("roshan");
    cust c2=new cust("prasad");
    
    s.register(c1);
    s.register(c2);

    s.invitesale();

    
  }
}
