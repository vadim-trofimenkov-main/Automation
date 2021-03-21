package main.trofimenkov.javapart.OOP.animal;

public class Vet {
    public void treatAnimal(Animal animal){
        System.out.println("Animal name: " + animal.getName() +
                ", Animal food: " + animal.getFood() + ", Animal location: " + animal.getLocation());
    }
}
