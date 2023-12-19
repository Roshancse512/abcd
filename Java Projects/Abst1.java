abstract  class super1
{
   super1()
  {
    System.out.println("super Cons");
  }
  public abstract void PlayCric();
  public void PlayFootBall()
  {
    System.out.println("Playing football");
  }
}
class sub extends super1 
{
  public void PlayCric()
  {
    System.out.println("playing cricket");
  }
  public void PLayCards()
  {
    System.out.println("Playing cards");
  }
}
class Abst1
{
  public static void main(String[] args) {
    sub obj=new sub();
    obj.PlayFootBall();
    obj.PlayCric();
    obj.PLayCards();
  }
}
