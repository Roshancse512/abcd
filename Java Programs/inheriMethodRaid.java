class cal{
  public int add(int a,int b)
  {
    return a+b;
  }
}
  class a extends cal{
    public int add(int a,int b)
    {
      return a+b+1; // it was override th method 1
    }
  }
class inheriMethodRaid
{
  public static void main(String[] args) {
    a c=new a();
    int r=c.add(20,50);
    System.out.println(r);

  }
}