package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CollectionsVsStreams {

    public static void main(String[] args) {
       List<String> names = new ArrayList<>();

       names.add("Pepe");
        names.add("Cástor");
        names.add("Leandro");

        for(String name:names){
            System.out.println(names);
        }

        for(String name:names){
            System.out.println(names);
        }

        Stream<String> stringStream = names.stream();

        stringStream.forEach(System.out::println);
        Consumer<String> cons =  (s) -> System.out.println(s);
        cons.accept("Paco");
        names.remove(0);

        System.out.println(names);


    }
}
