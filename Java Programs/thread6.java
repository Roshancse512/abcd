// Thread Classes
class a implements Runnable
{
  public void run()
  {

  }
}
class thread6
{
  public static void main(String[] args) {
    Thread t=new Thread("roshan prasad");
    System.out.println(t.getId());
    System.out.println(t.getName());
    System.out.println(t.getPriority());
    System.out.println(t.getState());
    System.out.println(t.isAlive());
    System.out.println(t.isDaemon());
  }
}