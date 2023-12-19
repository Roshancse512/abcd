import java.util.*;
import java.util.Arrays;
public class Links
{
  public static void main(String[] args) {
    LinkedList<String> ar=new LinkedList<>();
    LinkedList<String> ar2=new LinkedList<>();
   

    ar.add("Roshan");
    ar.add("Prasad");
    ar.add("Rocky");
    ar.add("Yarramsetti");
    System.out.println(ar);
    ar.add(0,"rocky");
    System.out.println(ar);
    ar.addFirst("King");
    ar.addLast("Kalyan");
    System.out.println(ar);
    ar2.addAll(ar);
    ar.clear();
    System.out.println(ar);
    
    Iterator <String> it=ar2.iterator();
    while(it.hasNext())
    System.out.println(it.next());

    System.out.println(ar2.remove("rocky"));
    for(int i=0;i<ar2.size();i++)
    System.out.println(ar2.get(i));

    ar2.forEach(x -> System.out.println((x)));
   
     for(String str:ar2)
     System.out.println(str);
  
    
  }
}

