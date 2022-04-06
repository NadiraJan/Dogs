package WolfsAndDogs;

public class Akita extends HomelyDog {

    private char gender;


    public Akita(String name, int lifespan, char size, char coat, char gender) {
        super(name, lifespan, size, coat);
        this.gender = gender;
    }

    public Akita() {
        super();
    }


    @Override
    public String toString() {
        return "Akita{" +
                "gender=" + gender +
                ", lifespan=" + lifespan +
                "} " + super.toString();
    }




    @Override
    public void sit() {
        super.sit();
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    public void layDown(){
      System.out.println("layDown");
  }

  public void dance(){
      System.out.println("dancing dog");
  }

  public void sing(){
      System.out.println("singing dog");
  }

}