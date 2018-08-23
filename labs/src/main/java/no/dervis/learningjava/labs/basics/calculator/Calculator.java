package no.dervis.learningjava.labs.basics.calculator;

public class Calculator {

    private int multiply;

    private String type;


    public Calculator(String type) {
        this.type = type;
        this.multiply = 2;
    }


    public int addNumbers(int a, int b) {
        return a+b;
    }


    public int multiplyNumbers(int i, int j) {
        return i*j;
    }


    public String changeModel(String model) {
        return getType() + " " + model;
    }



    public void setMultiply(int multiply) {
        this.multiply = multiply;
    }

    public int getMultiply(){
        return multiply;
    }


    public String getType() {
        return type;
    }


}
