package WolfsAndDogs;

public class Wolf {

    private String name;
    int lifespan;

    public Wolf(String name, int lifespan) {
        this.name = name;
        this.lifespan = lifespan;

    }

    public Wolf() {

    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }

    public int getLifespan() {
        return lifespan;

    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;

    }

    public void makeNoise() {
        System.out.println("auuuuuwwww");
    }

}




