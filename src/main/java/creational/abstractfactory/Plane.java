package creational.abstractfactory;

public class Plane implements Pilot {
    @Override
    public String fly() {
        return "I can fly a plane";
    }
}
