class NotEqual extends Exception
{
  String str1="Roshan";
  public String getMsg()
  {
      return "Not_Equal_char";
  }
  public void check(String Str2) throws Exception
  {
    if(str1.equals(Str2))
    System.out.println("equal");
    else
    throw new NotEqual();
  }
}
class Userexcp1
{
  public static void main(String[] args)throws Exception {
    NotEqual nt=new NotEqual();
    try
    {
      nt.check("Rocky");
    }
    catch(NotEqual A)
    {
      System.out.println(A.getMsg( ));
    }
  }
}