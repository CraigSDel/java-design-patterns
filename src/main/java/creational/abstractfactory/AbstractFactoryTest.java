package creational.abstractfactory;

import creational.factory.Aircraft;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory airplaneFactory = FactoryProducer.getFactory("aircraft");
        Aircraft helicopter = airplaneFactory.getAircraft("helicopter");
        Aircraft plane = airplaneFactory.getAircraft("plane");

        AbstractFactory pilotFactory = FactoryProducer.getFactory("pilot");
        Pilot helicopterPilot = pilotFactory.getPilot("helicopter");
        Pilot planePilot = pilotFactory.getPilot("plane");

        System.out.println("\n" + helicopter.getClass() + "\n" + helicopter.takeoff());
        System.out.println("\n" + plane.getClass() + "\n" + plane.takeoff());
        System.out.println("\n" + helicopterPilot.getClass() + "\n" + helicopterPilot.fly());
        System.out.println("\n" + planePilot.getClass() + "\n" + planePilot.fly());
    }
}
