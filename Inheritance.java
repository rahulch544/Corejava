public class Inheritance{


    public static void main(String[] args) {

        A b= new B();
        b.fcnA();
    }
}


// Overriding Static Methods
class A {

     public static void fcnA(){
        System.out.println("Hi FcnA");
    }

    private static void fcnAPrv(){
        System.out.println("Hi FcnA");
    }
}
class B extends A{

     public static void fcnA(){
        System.out.println("Hi FcnB");
    }

    private static void fcnAPrv(){
        System.out.println("Hi FcnB");
    }
}