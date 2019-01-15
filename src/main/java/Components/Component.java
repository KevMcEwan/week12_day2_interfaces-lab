package Components;

public abstract class Component {
    private String make;
    private String model;

    public Component(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public abstract String play();

    public String stop(){
        return "The music has stopped. A leaden silence descends.";
    }
}
