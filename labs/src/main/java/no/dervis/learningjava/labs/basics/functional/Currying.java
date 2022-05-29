package no.dervis.learningjava.labs.basics.functional;

import java.util.function.BinaryOperator;
import java.util.function.Function;

import static no.dervis.learningjava.tools.Headers.printHeader;
import static no.dervis.learningjava.tools.Strings.printf;

public class Currying {

    private final BinaryOperator<Double> divide = (a, b) -> a / b;
    private final ExtendedBinaryOperator<Double> multiply = (a, b) -> a * b;
    private final Function<Double, Double> multiply100 = multiply.curry(100d);


    private void testLambdaCalc() {

        printHeader("Simple currying");
        printf("50 is %.0f%% of 200", divide.andThen(multiply100).apply(50d, 200d));


        Function<Integer, Function<Integer, Integer>> f = x -> (y -> x + y);
        printHeader("Curried version of (a, b) -> a + b");
        printf("f(3, 4) = x -> (y -> x + y) = %s",  f.apply(3).apply(4) );


        Function<String, Tuple3<String, String, String, String>> strings = s1 -> (s2 -> (s3 -> (s4 -> s1 + s2 + s3 + s4)));
        printHeader("Curried version of a Tuple4");
        printf("f(A, B, C, D) = s1 -> (s2 -> (s3 -> (s4 -> s1 + s2 + s3 + s4))) = %s",
                strings
                .apply("A ")
                .apply("B ")
                .apply("C ")
                .apply("D") );

    }

    public static void main(String[] args) {
        new Currying().testLambdaCalc();
    }

    @FunctionalInterface
    interface ExtendedBinaryOperator<T> extends BinaryOperator<T> {
        default Function<T, T> curry(T t) {
            return u -> apply(u, t);
        }
    }

    interface Tuple3<T1, T2, T3, R> extends Function<T1, Function<T2, Function<T3, R>>> {}
}

