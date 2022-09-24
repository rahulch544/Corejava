
@FunctionalInterface
 interface GreetingInterface {
    
    void sayHello();
}


// General Way

 class HelloGreeting implements GreetingInterface {

    @Override
    public void sayHello() {
        // TODO Auto-generated method stub
        System.out.println("Hello World");
        
    }
    
}

public class Greeting {

    public static void main(String[] args) {
        // General way
        GreetingInterface greeting =  new HelloGreeting();
        greeting.sayHello();

        // Special Ways

        GreetingInterface greeting2 = new GreetingInterface(){
            @Override
            public void sayHello() {
                // TODO Auto-generated method stub
                System.out.println("Hello World For Greeting2");
                
            }
        };
        greeting2.sayHello();

        GreetingInterface greeting3 = ()->System.out.println("Hello World For Greeting3");
        greeting3.sayHello();

    }
}