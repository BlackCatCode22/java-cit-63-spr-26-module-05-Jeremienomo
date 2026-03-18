package MyZoo;

public class Tiger extends Animal {

    private int stripeCount;

    public Tiger(String name, int age) {
        super(name, age, "Tiger");
        this.stripeCount = 100;
    }

    public int getStripeCount() {
        return stripeCount;
    }
}
