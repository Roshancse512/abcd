class Parent {
    public void display() {
        System.out.println("Parent class display method");
    }
     @Deprecated
    public void deprecatedMethod() {
        System.out.println("This method is deprecated");
    }
}
 class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Child class display method");
    }
}
 public class Anno{
    public static void main(String[] args) {
        Child child = new Child();
        child.display(); // Calls the overridden method in Child class
        child.deprecatedMethod(); // Calls the deprecated method in Parent class
    }
}