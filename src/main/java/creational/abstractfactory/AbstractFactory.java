package creational.abstractfactory;

import creational.factory.Aircraft;

public abstract class AbstractFactory {
    public abstract Pilot getPilot(String pilotType);

    public abstract Aircraft getAircraft(String aircraft);
}
