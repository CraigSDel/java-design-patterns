package creational.abstractfactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factory) {
        if ("pilot".equalsIgnoreCase(factory)) {
            return new PilotFactory();
        }
        if ("aircraft".equalsIgnoreCase(factory)) {
            return new AircraftFactory();
        }
        return null;
    }
}
