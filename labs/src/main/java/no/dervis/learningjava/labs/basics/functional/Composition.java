package no.dervis.learningjava.labs.basics.functional;

import java.util.function.BinaryOperator;

public class Composition {

    private final static BinaryOperator<Double> divide = (a, b) -> a / b;

    private final static BinaryOperator<Double> multiply = (a, b) -> a * b;


    private void testLambdaCalc() {

        // creates a BinaryOperator and applies two numbers
        System.out.println( percentOf().apply(50d, 200d) );

        // composition using andThen and a lambda
        System.out.println( divide.andThen(a -> a * 100).apply(50d, 200d) );

        //
        System.out.println(percentOf(50, 200));

    }

    static <T extends Number> Double percentOf(T x, T y) {
        return divide.andThen(a -> a * 100).apply(x.doubleValue(), y.doubleValue());
    }

    BinaryOperator<Double> percentOf() {
        return (a, b) -> multiply.apply(divide.apply(a, b), 100d);
    }


    public static void main(String[] args) {
        new Composition().testLambdaCalc();
    }

}

