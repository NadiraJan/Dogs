package WolfsAndDogs;

public  class Affenpinscher extends HomelyDog{

    private String color;
    private String nickName;

    public Affenpinscher(String name, int lifespan, char size, char coat, String color, String nickName) {

        super(name, lifespan, size, coat);
        this.color = color;
        this.nickName = nickName;
    }

    public Affenpinscher() {

    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    public  void dance(){
        System.out.println("Dancing Dog");
    }
    }




