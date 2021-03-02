package creational.factory;

public class Plane implements Aircraft {
    @Override
    public String takeoff() {
        return "Gaining ground speed to create a enough air speed over my wings to take off";
    }
}
