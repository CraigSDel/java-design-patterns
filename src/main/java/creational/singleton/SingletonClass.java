package creational.singleton;

public class SingletonClass {
    private static SingletonClass instance = new SingletonClass();
    private int calls;

    private SingletonClass() {
        this.calls = 0;
    }

    public static SingletonClass getInstance() {
        return instance;
    }

    public String getMessage() {
        return "How many times I have been called " + (++calls);
    }
}
