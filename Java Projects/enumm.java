enum status{
    starting ,going,running,failed,completed;
}
class enumm
{
  public static void main(String[] args) {
    status s=status.starting;
    System.out.println(s);

    status ss[]=status.values();
    for(status s1:ss)
    System.out.println(s1+""+s.ordinal());

    status s2=status.failed;
    if(s2==status.starting)
    {
      System.out.println("started");
    }
    else if(s2==status.going)
    {
      System.out.println("going");
    }
    else if(s2==status.running)
    {
      System.out.println("running");
    }
    else
    {
      System.out.println("failed");
    }

    status s3=status.completed;
    switch(s3)
    {
      case starting:System.out.println("start");
                    break;
      case going:System.out.println("goes");
      break;
      case running:System.out.println("run");
      break;        
      case completed:System.out.println("completed");
      break;      
    }
  }

}