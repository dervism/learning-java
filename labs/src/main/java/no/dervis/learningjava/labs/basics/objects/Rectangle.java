package no.dervis.learningjava.labs.basics.objects;

public class Rectangle extends Shape implements RectangleCalculator {
    @Override
    String draw() {
        return "Rectangle";
    }

    @Override
    public int calculateSizeOfRectangle() {
        return 100;
    }
}
