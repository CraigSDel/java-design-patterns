package structural.adapter;

public class BuilderImplementation implements Builder {
    BuilderAdapter builderAdapter;

    @Override
    public void build(String type, int numberOfSeats) {
        if ("helicopter".equalsIgnoreCase(type) || "plane".equalsIgnoreCase(type)) {
            builderAdapter = new BuilderAdapter(type);
            builderAdapter.build(type, numberOfSeats);
        } else {
            System.out.println("I can't make a factory of that type");
        }
    }
}
