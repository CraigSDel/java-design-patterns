package creational.prototype;

public class HelicopterPilot extends Soldier {
    @Override
    void move() {
        System.out.println("Blades are rotating");
    }

    @Override
    public void setId(String id) {
        super.id = id;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public String getId() {
        return super.id;
    }

    @Override
    public String getName() {
        return super.name;
    }
}
