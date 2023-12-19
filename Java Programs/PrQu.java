import java.util.*;
import java.util.Comparator;
//for searching sorting method
class MyCom implements Comparator<Integer>
{
  public int compare(Integer i,Integer j)
  {
    if(i>j)
    return -1;
    else if(i<j)
    return 1;
    else
    return 0;
  }
}
public class PrQu {
  public static void main(String[] args) {
    
    PriorityQueue <Integer> pq=new PriorityQueue<>(new MyCom());

    pq.add(10);
    pq.add(25);
    pq.add(15);
    pq.add(8);
    pq.add(26);

  //  pq.forEach(x -> System.out.println(x));

  System.out.println("peek"+pq.peek());
    Iterator<Integer> it=pq.iterator();
    while(it.hasNext())
    {
      System.out.println(it.next());
    }

    pq.poll();
    System.out.println(pq);
  }
  
}
