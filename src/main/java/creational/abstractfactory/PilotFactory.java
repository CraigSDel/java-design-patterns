package creational.abstractfactory;

import creational.factory.Aircraft;

public class PilotFactory extends AbstractFactory {

    @Override
    public Pilot getPilot(String pilotType) {
        if (null == pilotType) {
            return null;
        }
        if ("helicopter".equalsIgnoreCase(pilotType)) {
            return new Helicopter();
        }
        if ("plane".equalsIgnoreCase(pilotType)) {
            return new Plane();
        }
        return null;
    }

    @Override
    public Aircraft getAircraft(String pilotType) {
        // don't implement
        return null;
    }
}
