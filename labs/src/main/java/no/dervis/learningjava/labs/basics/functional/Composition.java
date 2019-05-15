package no.dervis.learningjava.labs.basics.functional;

import java.util.function.BinaryOperator;

public class Composition {

    private BinaryOperator<Double> divide = (a, b) -> a / b;

    private BinaryOperator<Double> multiply = (a, b) -> a * b;

    private BinaryOperator<Double> percentOf = (a, b) -> multiply.apply(divide.apply(a, b), 100d);


    private void testLambdaCalc() {

        System.out.println( percentOf.apply(50d, 200d) ); // should print 25%

        // andThen, caller first, parameter second
        System.out.println(
                divide.andThen(a -> a * 100).apply(50d, 200d)
        );

    }


    public static void main(String[] args) {
        new Composition().testLambdaCalc();
    }

}

