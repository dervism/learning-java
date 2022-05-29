package no.dervis.learningjava.labs.basics.functional;

import java.util.function.BinaryOperator;

import static no.dervis.learningjava.tools.Headers.printHeader;
import static no.dervis.learningjava.tools.Strings.printf;

public class Composition {

    private final BinaryOperator<Double> divide = (a, b) -> a / b;

    private final BinaryOperator<Double> multiply = (a, b) -> a * b;

    // composes a new function using other functions
    private final BinaryOperator<Double> percentOf = (a, b) -> multiply.apply(divide.apply(a, b), 100d);


    private void testLambdaCalc() {

        printHeader("Function composition:");
        printf(
                "50 is %.0f%% of 200",
                percentOf.apply(50d, 200d)
        );

        printHeader("Function with andThen (caller first, parameter second)");
        printf(
                "50 is %.0f%% of 200",
                divide.andThen(a -> a * 100).apply(50d, 200d)
        );

    }


    public static void main(String[] args) {
        new Composition().testLambdaCalc();
    }

}

