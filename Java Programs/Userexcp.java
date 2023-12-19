 class InvaildAgeException extends Exception
{
  public String toString()
  {
    return "your_age_is_invaild";
  }
  public void ageCheck(int age) throws Exception
  {
    if(age<=18)
     throw new InvaildAgeException();
     else
     System.out.println("go and apply for vote");
  }
}
class Userexcp
{
  public static void main(String[] args)
  {
    InvaildAgeException i=new InvaildAgeException();
    try {
      i.ageCheck(20);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    }
}