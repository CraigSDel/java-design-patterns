package creational.factory;

public class Helicopter implements Aircraft {
    @Override
    public String takeoff() {
        return "Creating enough pressure under my rotors to generate lift";
    }
}
