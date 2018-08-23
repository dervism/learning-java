package no.dervis.learningjava.labs.basics.objects;

public class Circle extends Shape implements Equipment {
    @Override
    String draw() {
        return "Circle";
    }

    @Override
    public String equipmentName() {
        return "Circular equipment";
    }
}
