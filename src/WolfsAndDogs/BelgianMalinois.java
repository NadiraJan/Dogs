package WolfsAndDogs;

public class BelgianMalinois extends WildDog {

    private boolean dangerous;
    private double maxRunningSpeed;


    public BelgianMalinois(String name, int lifespan, char size, boolean dangerous, double maxRunningSpeed) {

        super(name, lifespan, size);
        this.dangerous = dangerous;
        this.maxRunningSpeed = maxRunningSpeed;
    }

    public BelgianMalinois() {
        super();
    }

    @Override
    public void makeNoise() {
        super.makeNoise();

    }

    public void defend(){
        System.out.println("defends");

    }

    public void attack(){
        System.out.println("attacks");

      }

   }
