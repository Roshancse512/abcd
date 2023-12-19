public class MainCal
{
  public static void main(String[] args) {
    VeryAdvCal v=new VeryAdvCal();
    int r=v.add(20, 30);
    int r1=v.sub(30, 20);
    int r2=v.multi(5, 5);
    int r3=v.div(15, 3);
    double r4=v.pow(5, 3);
    System.out.println(r+" "+r1+" "+r2+" "+r3+" "+r4);
  }
}