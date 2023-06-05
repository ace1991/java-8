package defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,5);

        Multiplier multiplier = new MultiplierImpl();
        System.out.println("Multiplication: " + multiplier.multiply(integerList));
        System.out.println("Size: " + multiplier.size(integerList));
        System.out.println("Is empty?: " + Multiplier.isEmpty(integerList));
    }
}
