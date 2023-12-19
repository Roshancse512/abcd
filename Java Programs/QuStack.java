import java.util.ArrayDeque;


public class QuStack {
public static void main(String[] args) {
  ArrayDeque<Integer> dq=new ArrayDeque<>();
  //Queue
  dq.addLast(10);
  dq.addLast(20);
  dq.addLast(30);
  dq.addLast(40);

  dq.removeFirst();

  int i=dq.poll();
  System.out.println(i);

  System.out.println(dq);

  ArrayDeque<Integer> st=new ArrayDeque<>();
  //Stack
  st.addFirst(100);
  st.addFirst(200);
  st.addFirst(300);

  st.removeFirst();

  System.out.println(st);
}
  
}
