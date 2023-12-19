import java.util.Scanner;

public class Recu {
// Recursion 
  public static void fun(long i)
  {
    if(i>0)
    {
    System.out.println(i);
    fun(i-1);
    }
  }
  public static void main(String[] args) {
    long size;
    Scanner st=new Scanner(System.in);
    size=st.nextLong();
    fun(size);
    st.close();
  }
}
