 class NotValid extends Exception {
    public NotValid(String string) {
        super(string);
    }
     public void div(int a, int b) throws NotValid {
        if (a == 0 || b == 0)
            throw new NotValid("Not_Valid");
        int c = a / b;
        System.out.println(c);
    }
}
class abc extends NotValid {
    public abc(String string) {
    super(string);
    //TODO Auto-generated constructor stub
  }

   
}
 class Userexcp2 {
    public static void main(String[] args) {
        abc nv = new abc("hi");
        try {
            nv.div(20, 0);
        } catch (NotValid a) {
            System.out.println(a.getMessage());
        }
    }
}