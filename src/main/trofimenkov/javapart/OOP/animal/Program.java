package main.trofimenkov.javapart.OOP.animal;

public class Program {
    public static void main(String[] args) {
        Vet vet = new Vet();
        Animal[] animals = new Animal[5];
        animals[0] = new Dog("Bob", "chicken", "Belarus", "ball");
        animals[1] = new Cat("Felix", "fish", "Russia", true);
        animals[2] = new Horse("Marta", "grass", "Latvia", true);
        animals[3] = new Dog("Scooby", "bone", "Poland", "Teddy bear");
        animals[4] = new Cat("Tom", "milk", "Ukraine", false);
        System.out.println("Welcome to your vet appointment!");
        for (Animal a: animals) {
            vet.treatAnimal(a);
            a.makeNoise();
            a.eat();
        }
    }

}
