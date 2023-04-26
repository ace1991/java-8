package functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a,b) -> a*b;

        System.out.println(binaryOperator.apply(3,4));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);

        System.out.println("MinBy: " + minBy.apply(5,4));
        System.out.println("MaxBy: " + maxBy.apply(6,7));
    }
}
