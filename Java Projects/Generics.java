class container <a extends Number>//it accepts only numbers the number can accept the int,float,double datatypes
{
  a value;
}
// class con<b> 
// {
//   b name1;
// }
class cons<c extends Number>
{
      c age,salary;

      public c getAge() {
        return age;
      }

      public void setAge(c age) {
        this.age = age;
      }

      public c getSalary() {
        return salary;
      }

      public void setSalary(c salary) {
        this.salary = salary;
      }
}
class Generics
{
  public static void main(String[] args) {
    container<Integer> c=new container<>();
    // con<String> c1=new con<>();
    // c1.name1="roshan";
    c.value=10;
    // System.out.println(c1.name1);
    System.out.println(c.value);
    cons<Double> cs=new cons<>();
    cs.age=21.22;
    cs.salary=40000.151;
    System.out.println(cs.age+" "+cs.salary);
  }
}