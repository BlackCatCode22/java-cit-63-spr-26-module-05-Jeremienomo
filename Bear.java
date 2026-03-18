package MyZoo;

public class Bear extends Animal {

    private boolean hibernates;

    public Bear(String name, int age) {
        super(name, age, "Bear");
        this.hibernates = true;
    }

    public boolean getHibernates() {
        return hibernates;
    }
}
