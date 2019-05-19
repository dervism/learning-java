package no.dervis.learningjava.labs.basics.functional;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Currying {

    private BinaryOperator<Double> divide = (a, b) -> a / b;

    private ExtendedBinaryOperator<Double> multiply = (a, b) -> a * b;

    private Function<Double, Double> multiply100 = multiply.curry(100d);


    private void testLambdaCalc() {

        // using currying
        System.out.println(
                divide.andThen(multiply100).apply(50d, 200d)
        );
    }

    @FunctionalInterface
    interface ExtendedBinaryOperator<T> extends BinaryOperator<T> {
        default Function<T, T> curry(T t) {
            return u -> apply(t, u);
        }
    }


    public static void main(String[] args) {
        new Currying().testLambdaCalc();
    }
}

