class test{
  static int price=10;
  static double OnRoadPrice(String city)
  {
    switch(city)
    {
      case "delhi" : return price*10.0;

      case "tanuku" :  return price*+9.0;
    }
    return price;
  }
}
class staticMem
{
  public static void main(String[] args) {
    System.out.println(test.OnRoadPrice("delhi"));  //calliig without about it can be done by using static only
   test.price=20;
    System.out.println(test.price);
    test t=new test();
    System.out.println(t.OnRoadPrice("tanuku")); //calling with object 
  }
}