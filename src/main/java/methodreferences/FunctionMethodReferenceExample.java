package methodreferences;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionMethodReferenceExample {

    static Function<String,String> toUpperCaseLambda = (s -> s.toUpperCase());

    static UnaryOperator<String> toUpperCaseLambdaUnary = (s -> s.toUpperCase());

    static Function<String,String> toUpperCaseMethodReference = String::toUpperCase;

    public static void main(String[] args) {

        System.out.println(toUpperCaseLambda.apply("java 8"));

        System.out.println(toUpperCaseLambdaUnary.apply("java 9"));

        System.out.println(toUpperCaseMethodReference.apply("java 10"));
    }
}
