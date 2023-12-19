class Acc
{
  private double accno;
  private String accname;
  private String add;
  private int phno;
  private int dob;
  private double bal;
  public Acc()
  {
  
  }
  public double getacc()
  {
    
    return accno;
  }
  public String getnamec()
  {
    return accname;
  }
  public String getadd()
  {
    return add;
  }
  public double getphno()
  {
    return phno;
  }
  public int getdob()
  {
    return dob;
  }
  public double getbal()
  {
    return bal;
  }
  public double setacc(double i)
  {
    accno=i;
    return accno;
  }
  public String setnamec(String s)
  {
    accname=s;
    return accname;
  }
  public String setadd(String addr)
  {
    add=addr;
    return add;
  }
  public int setphno(int ph)
  {
    phno=ph;
    return phno;
  }
  public int setdob(int i)
  {
    dob=i;
    return dob;
  }
  public double setbal(double ba)
  {
    bal=ba;
    return bal;
  }

}
class Savacc extends Acc
{
  public double deposit(double debal)
  {
      return debal+getbal();
  }
  public double withdraw(double withdr)
  {
    return getbal()-withdr;
  }
  public String toString()
  {
    return getacc()+"\n"+getnamec()+"\n"+getbal()+"\n"+getadd()+"\n"+getphno();
  }
}
class Loanacc extends Acc
{
  public double emi;
  public double setemi(double e)
  {
    emi=e;
    return emi;
  }
  public double getemi()
  {
    return emi;
  }
   public  String repay(double repay)
  {
    double repay1=getemi()-repay;
      return repay1+"\n"+getacc()+"\n"+getnamec();
  }
  public String toString()
  {
    
    return "\n"+getemi()+"\n"+getacc()+"\n"+getnamec();
  }
 
}
class inheri2
{
  public static void main(String[] args) {
    Acc a=new Acc();
    a.setacc(187);
    Savacc s1=new Savacc();
    s1.setacc(145);
    s1.setnamec("Roshan");
    s1.setbal(3300);
    s1.setdob(28-8-2001);
    s1.setadd("Velpuru");
    s1.setphno(5866);
   System.out.println( s1.toString());
   System.out.println(s1.deposit(100));
   System.out.println(s1.withdraw(3000));
   Loanacc l1=new Loanacc();
   System.out.println("loan amount is");
   l1.setacc(7999);
   l1.setnamec("prasad");
   l1.setemi(2000);
   System.out.println(l1.getemi());
   System.out.println("after repay");
   System.out.println(l1.repay(200));
    
    
  
  }
}
