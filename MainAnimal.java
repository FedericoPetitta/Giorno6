import java.util.ArrayList;

public class MainAnimal {

    public static void suono(Animal Animale) {
        Animale.animalSound();

    }

    public static class Pippo extends Animal {
        @Override
        public void animalSound() {
            System.out.println("pippo");
        }
    }

    public static void main(String[] args) {
        Animal myanimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();
        Animal myPippo = new Pippo();
        // myanimal.animalSound();
        // myPig.animalSound();
        // myDog.animalSound();
        suono(myDog);
        suono(myPig);
        suono(myPippo);

        ArrayList<Animal> Animali = new ArrayList<Animal>();
        Animali.add(myanimal);
        Animali.add(myPig);
        Animali.add(myDog);
        Animali.add(myPippo);

        for (int i = 0; i < Animali.size(); i++) {
            suono(Animali.get(i));
        }

    }

}
