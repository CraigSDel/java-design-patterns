package creational.abstractfactory;


import creational.factory.Aircraft;
import creational.factory.Helicopter;
import creational.factory.Plane;

public class AircraftFactory extends AbstractFactory {

    @Override
    public Pilot getPilot(String pet) {
        // don't implement
        return null;
    }

    public Aircraft getAircraft(String aircraftType) {
        if (null == aircraftType) {
            return null;
        }
        if ("helicopter".equalsIgnoreCase(aircraftType)) {
            return new Helicopter();
        }
        if ("plane".equalsIgnoreCase(aircraftType)) {
            return new Plane();
        }
        return null;
    }
}
