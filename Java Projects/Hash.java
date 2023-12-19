import java.util.*;
import java.util.function.Predicate;

public class Hash {
  public static void main(String[] args) {
    HashSet<Integer> hs=new HashSet<>(20,0.75f);
    HashSet<Integer> hs1=new HashSet<>();
  Predicate<Integer> p=n1-> n1%2==0;
  
    
   
    hs.add(10);
    hs.add(20);
    hs.add(30);
    hs.add(40);
    
    // int result = hs.stream().filter(n-> n%2==0).map(n->n*2).reduce(0, (c,e)->c+e);
    int result = hs.stream().filter(p).map(n->n*2).reduce(0, (c,e)->c+e);
    System.out.println(result);

    hs.remove(40);
    Iterator<Integer> itr=hs.iterator();
    while(itr.hasNext())
    {
      System.out.println(itr.next());
    }

  }
  
}
