package WolfsAndDogs;

public class Dog extends Wolf {

    private char size;
    private static int count=0;

    {
        count++;
    }
    public Dog(String name, int lifespan, char size) {
        super(name, lifespan);
        this.size = size;
    }

    public Dog(String dog) {
        super();
    }

    public Dog() {

    }

    @Override
    public void makeNoise() {

        System.out.println("wow wow wow");

    }

    public void sit() {

        System.out.println("dog sits");

    }

    public static int getCount() {

        return count;

    }
}
