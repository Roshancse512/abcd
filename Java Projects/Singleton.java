// in the singleton the we can create number of the objects but the reference is same it call the methods according to the condtion

class coffemc

{
  private float coffeQty;
  private float milkQty;
  private float waterQty;
  private float sugarQty;
  static private coffemc my=null;
  private coffemc()
  {
    coffeQty=1;
    milkQty=1;
    waterQty=1;
    sugarQty=1;
    System.out.println(coffeQty+" "+milkQty+" "+waterQty+" "+sugarQty);
  }
  public void fillWater(float qty)
  {
    waterQty=qty;
  }
  // public void fillsugar(float qty)
  // {
  //   sugarQty=qty;
  // }
  // public float getCoffe()
  // {
  //   return  0.215f;
  // }
  static coffemc getInstanc()
  {
    if(my==null)
      my=new coffemc();
      return my;
  }

}
public class Singleton
{
  public static void main(String[] args) {
    coffemc m1=coffemc.getInstanc();
    coffemc m2=coffemc.getInstanc();
    coffemc m3=coffemc.getInstanc();

    System.out.println(m1+" "+m2+" "+m3);
    if(m1==m2 && m1==m3)
    System.out.println("same");
  }
}