import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreams {
    

    public static void main(String[] args) {

        List<String> countries = new ArrayList<String>();
        countries.add("india");
        countries.add("america");
        countries.add("asia");
        countries.add("japan");



        Stream<String> countrieStream =  countries.stream();
        

        Stream<String> stream = Stream.of("a","b","c");

        countries.stream().map(s->s.toUpperCase()).
        filter(s -> s.startsWith("A"))
        .sorted().forEach(s->System.out.println(s));

        countries.stream().sorted().forEach(s -> System.out.println(s));

    }
}

