import java.util.Random;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;

public class functionalProgram {

    public static void main(String[] args) {
        // By Creating Functional Interface
        Calculator calculator = (int x,int y)->{
            Random random = new Random();
            // returns number btw 0-49
            int randomNumber = random.nextInt(50);

            return x*y+ randomNumber;
        };
        System.out.println(calculator.calculate(3,4));


        // Using Latest Java 8 Features

        IntBinaryOperator calculator2 = (x,y)->{
            Random random = new Random();
            // returns number btw 0-49
            int randomNumber = random.nextInt(50);

            return x*y+ randomNumber;
        };

        System.out.println(calculator2.applyAsInt(3,4));

        // Functional interface Lamda
        Function<Integer,String> evenNumber = (Integer a)->{ if(a%2==0) return "True";
        else return "False";
        };
        System.out.println(evenNumber.apply(34));

        // Boolean Interface
        Predicate<Integer> evenNumberBool = (a)-> a%2==0 ;

        System.out.println(evenNumberBool.test(34));

    }
    
}


@FunctionalInterface
interface Calculator{

    int calculate(int x, int y);
}



