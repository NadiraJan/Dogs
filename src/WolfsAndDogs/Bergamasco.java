package WolfsAndDogs;

public class Bergamasco extends HomelyDog{

    private int maxRunningSpeed;
    private double hairLength;


    public Bergamasco(String name, int lifespan, char size, char coat, int maxRunningSpeed, double hairLength) {
        super(name, lifespan, size, coat);
        this.maxRunningSpeed = maxRunningSpeed;
        this.hairLength = hairLength;
    }

    public Bergamasco() {

    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    public void kiss(){

        System.out.println("He likes kisses");
    }
}
