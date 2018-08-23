package no.dervis.learningjava.labs.parking_house;

public class ParkingCost {

    private double costPrHour;

    public ParkingCost(double costPrHour) {
        this.costPrHour = costPrHour;
    }

    public double getCostPrHour() {
        return costPrHour;
    }


    public void setCostPrHour(double costPrHour) {
        this.costPrHour = costPrHour;
    }

    @Override
    public String toString() {
        return "ParkingCost{" +
                "costPrHour=" + costPrHour +
                '}';
    }
}
