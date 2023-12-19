// import java.time.Year;
import java.util.Calendar;
class std
{
  private String rollno;
  private static int count=1;
  private String assignRollNo()
  {
    Calendar d= Calendar.getInstance();
    
    String rno="univ-"+(d.get(Calendar.YEAR)+"-"+count);
    count++;

    return rno;
  }
  std()
  {
    rollno=assignRollNo();
  }
  public String getRollNo()
  {
    return rollno;
  }
}
class FinalStaticSC
{
  public static void main(String[] args) {
   std s1=new std();
   std s2=new std();
   std s3=new std();

   System.out.println(s1.getRollNo());
   System.out.println(s2.getRollNo());
   System.out.println(s3.getRollNo());
  }
}