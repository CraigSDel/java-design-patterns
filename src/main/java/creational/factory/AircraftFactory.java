package creational.factory;


public class AircraftFactory {

    public static void main(String[] args) {
        AircraftFactory aircraftFactory = new AircraftFactory();
        Aircraft helicopter = aircraftFactory.getAircraft("helicopter");
        Aircraft plane = aircraftFactory.getAircraft("plane");
        System.out.println("\n" + helicopter.getClass() + "\n" + helicopter.takeoff());
        System.out.println("\n" + plane.getClass() + "\n" + plane.takeoff());
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
