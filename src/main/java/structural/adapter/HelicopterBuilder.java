package structural.adapter;

public class HelicopterBuilder implements AircraftBuilder{
    @Override
    public void buildHelicopter(int numberOfSeats) {
        System.out.println("Building a helicopter");
    }

    @Override
    public void buildPlane(int numberOfSeats) {
        //don't implement
    }
}
