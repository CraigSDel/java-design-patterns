package structural.adapter;

public class BuilderAdapter implements Builder {

    AircraftBuilder aircraftBuilder;

    public BuilderAdapter(String type) {
        if ("helicopter".equalsIgnoreCase(type)) {
            aircraftBuilder = new HelicopterBuilder();
        }
        if ("plane".equalsIgnoreCase(type)) {
            aircraftBuilder = new HelicopterBuilder();
        }
    }

    @Override
    public void build(String type, int numberOfSeats) {
        if ("helicopter".equalsIgnoreCase(type)) {
            aircraftBuilder.buildHelicopter(numberOfSeats);
        }
        if ("plane".equalsIgnoreCase(type)) {
            aircraftBuilder.buildPlane(numberOfSeats);
        }
    }
}
