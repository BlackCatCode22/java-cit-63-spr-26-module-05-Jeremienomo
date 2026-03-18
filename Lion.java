package MyZoo;

public class Lion extends Animal {

    private double maneLength;

    public Lion(String name, int age) {
        super(name, age, "Lion");
        this.maneLength = 10.0;
    }

    public double getManeLength() {
        return maneLength;
    }
}
