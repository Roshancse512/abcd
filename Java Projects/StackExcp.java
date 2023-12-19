import java.util.Scanner;
class StackOverFlow extends Exception
{
  public String toString()
  {
    return "StackOverFlow";
  }
}
class StackUnderFlow extends Exception
{
  public String toString()
  {
    return "StackUnderFlow";
  }
}
class Stack
{
  int A[];
  int top=-1;
  int data;
  public Stack(int da)
  {
    data=da;
    A=new int[da];
  }
  public void push(int ele) throws StackOverFlow
  {
    if(top==data-1)
    throw new StackOverFlow();
    else
    top++;
    A[top]=ele;
  }
  public int pop() throws StackUnderFlow
  {
    int x=1;
    if(top==-1)
    throw new StackUnderFlow();
    else
    x=A[top];
    top--;
    return x;
  }
}
class StackExcp
{
  public static void main(String[] args) {
   Stack st=new Stack(3);
   try{
        st.push(25);
        st.push(25);
        st.push(25);
        st.push(25);
        st.push(25);
        st.push(25);
   }
   catch(StackOverFlow ae)
   {
    System.out.println(ae);
   }
   try{
    st.pop();
    st.pop();
    st.pop();
    st.pop();
    st.pop();
    st.pop();
    st.pop();
    st.pop();
   }
   catch(StackUnderFlow ae1)
   {
    System.out.println(ae1);
   }
  }
}