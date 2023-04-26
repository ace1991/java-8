package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        /*
        Previo Java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);    // iguales = 0
                                            // o1>o2 1
                                            // o1<o2 -1
            }
        };
        System.out.println("Result of compare: " + comparator.compare(3,2));

        /*
        Forma Lambda
         */

        Comparator<Integer> comparator1 = (Integer o1,Integer o2) -> o1.compareTo(o2);
        System.out.println("Result of compare using Lambda : " + comparator1.compare(3,2));

        Comparator<Integer> comparator2 = ( o1, o2) -> o1.compareTo(o2);
        System.out.println("Result of compare using Lambda 2 : " + comparator2.compare(3,2));
    }
}
