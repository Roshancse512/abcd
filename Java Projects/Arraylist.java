import java.util.*;
import java.util.Arrays;
public class Arraylist
{
  public static void main(String[] args) {
    ArrayList<Integer> ar=new ArrayList<>(10);
    ArrayList<Integer> ar1=new ArrayList<>();
    ArrayList<Integer> ar3=new ArrayList<>(List.of(10, 20, 30, 40, 50, 60, 70));

    ar.add(1);
    ar.add(2);
    ar.add(3);
    ar.add(4);
    ar.add(5);
    ar.add(6);
    ar.addAll(6, ar3);

    System.out.println(ar);
    System.out.println(ar3.contains(20));//checks whether the ele is present or not
    System.out.println(ar3.get(6));//gets the element in that index
    System.out.println(ar.clone());

    ar1.add(100);
    ar1.add(200);
    ar1.add(300);
    ar1.add(400);

    Iterator<Integer> itr=ar1.iterator();
   for(Integer i:ar1)
   System.out.println(i);

    ListIterator<Integer> itr1=ar1.listIterator();
    
    for(int i=0;i<ar.size();i++)
    System.out.println((ar.get(i)));
    
    ar1.clear();
    System.out.println(ar1);
    }
}
