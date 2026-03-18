package MyZoo;

public class Hyena extends Animal {

    private String laughType;

    public Hyena(String name, int age) {
        super(name, age, "Hyena");
        this.laughType = "Giggle";
    }

    public String getLaughType() {
        return laughType;
    }
}
