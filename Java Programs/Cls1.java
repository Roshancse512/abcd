class cal
{
  public int add(int n1,int n2)
  {
    int r= n1+n2;
    return r;
  }
  public int sub(int n1,int n2)
  {
    int r= n1-n2;
    return r;
  }
  public int mul(int n1,int n2)
  {
    int r= n1*n2;
    return r;
  }
}
class Cls1
{
  public static void main(String[] args) {
    int num=5,num1=10;
    cal c=new cal();
    int r,r2;
    System.out.println(r=c.add(num,num1));
    System.out.println(c.sub(num,num1));
    r2=c.mul(num,num1);
    System.out.println(r2);
    

  }
}