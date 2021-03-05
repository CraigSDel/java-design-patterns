package creational.prototype;

public class FighterPilot extends Soldier {
    @Override
    void move() {
        System.out.println("Jet engines are burning");
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
