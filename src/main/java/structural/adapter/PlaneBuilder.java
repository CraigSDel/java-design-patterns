package structural.adapter;

public class PlaneBuilder implements AircraftBuilder {
    @Override
    public void buildHelicopter(int numberOfSeats) {
        // don't implement
    }

    @Override
    public void buildPlane(int numberOfSeats) {
        System.out.println("Building a plane");
    }
}
