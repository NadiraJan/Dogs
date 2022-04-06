package WolfsAndDogs;

import static WolfsAndDogs.Dog.getCount;

public class App {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.sit();

        Akita akita = new Akita();
        Bergamasco bergamasco = new Bergamasco();
        Affenpinscher affenpinscher = new Affenpinscher();
        Pekingese pekingese = new Pekingese();
        BelgianMalinois belgianMalinois = new BelgianMalinois();

        printDog(akita);
        printDog(bergamasco);
        printDog(akita);
        printDog(pekingese);
        printDog(bergamasco);

        Dog  [ ] dogs = new Dog [10];
        dogs [0] = akita;
        dogs [1] = bergamasco;
        dogs [2] = affenpinscher;
        dogs [3] = pekingese;
        dogs [4] = belgianMalinois;

        System.out.println("dog's name is: " + dogs[2]);

        }

    private static void printDog(Dog dog) {

        System.out.println("Dog name is  " + dog.getName());
        dog.sit();
        dog.makeNoise();
        dog.getClass();
        System.out.println();
        System.out.println("quantity of dogs is : " + dog.getCount());

        if (dog instanceof Akita) {   //instantie van Akita dog
            Akita akita1 = (Akita) dog;
            akita1.sing();
            akita1.dance();
            akita1.layDown();

        }
           System.out.println();

        }
    }

