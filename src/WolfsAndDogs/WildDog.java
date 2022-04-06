package WolfsAndDogs;

public class WildDog extends Dog {

    private int bark;

    public WildDog(String name, int lifespan, char size) {
        super(name, lifespan, size);
    }

    public WildDog() {

    }

    @Override
    public String toString() {
        return "WildDog{" +
                "lifespan=" + lifespan +
                "} " + super.toString();
    }

    public void hunt() {
        System.out.println("dog is hunting");

    }
}