package creational.prototype;

import java.util.Hashtable;
import java.util.Map;

public class SoldierHashTable {

    private static Map<String, Soldier> employeeMap = new Hashtable<String, Soldier>();

    public static Soldier getEmployee(String id) {
        Soldier cacheEmployee = employeeMap.get(id);
        // a cast is needed because the clone() method returns an Object
        return (Soldier) cacheEmployee.clone();
    }

    public static void loadCache() {
        // predefined objects to simulate retrieved objects from the database
        Soldier programmer = new FighterPilot();
        programmer.setId("ETPN1");
        employeeMap.put(programmer.getId(), programmer);

        Soldier janitor = new HelicopterPilot();
        janitor.setId("ETJN1");
        employeeMap.put(janitor.getId(), janitor);
    }
}
