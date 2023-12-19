public class Meth1 
{
   static int max(int x,int y)
    {
      if(x>y)
      return x;
      else
      return y;
    }
public static void main(String[] args) {
  {
    int a=10,b=20,c;
    c=max(a,b);
    System.out.println(c);
    System.out.println(max(a,b));

    // Meth1 m=new Meth1();
    // System.out.println(m.max(a, b));
  }
}

  
}
