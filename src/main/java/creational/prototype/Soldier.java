package creational.prototype;

public abstract class Soldier implements Cloneable {
    protected String id;
    protected String name;

    abstract void move();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException exception) {
            exception.printStackTrace();
        }
        return clone;
    }

    public abstract String getId();

    public abstract void setId(String id);

    public abstract String getName();

    public abstract void setName(String name);
}
