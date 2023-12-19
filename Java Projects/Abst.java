abstract class car
{
  car()
  {
    System.out.println("car");
  }
  public abstract void Autopilot();
  public void CarDrive()
  {
    System.out.println("Car Driving");
  }
}
abstract class UpdateCar extends car
{
  public void MusicPlay()
  {
    System.out.println("playing music");
  }
  public void OpenCam()
  {
    System.out.println("Opening cam");
  }
}
class AdvCar extends UpdateCar
{
  public void Autopilot()
  {
    System.out.println("Auto pilot mode on");
  }

}
class Abst 
{
  public static void main(String[] args) {
    AdvCar obj=new AdvCar();
    obj.CarDrive();
    obj.MusicPlay();
    obj.OpenCam();
    obj.Autopilot();
  }
}
