package WolfsAndDogs;

public class Pekingese extends HomelyDog{

    private double hairLength;

    public Pekingese(String name, int lifespan, char size, char coat, double hairLength) {
        super(name, lifespan, size, coat);
        this.hairLength = hairLength;
    }

    public Pekingese() {

    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    public void play(){
        System.out.println("plays");
    }
}

