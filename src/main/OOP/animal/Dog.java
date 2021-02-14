package main.OOP.animal;

public class Dog extends Animal{
    private String favouriteToy;

    public Dog(String name, String food, String location, String favouriteToy) {
        super(name, food, location);
        this.favouriteToy = favouriteToy;
    }

    @Override
    public void makeNoise() {
        System.out.printf("%s is sleeping with %s \n", super.getName(), favouriteToy);
    }

    @Override
    public void eat() {
        System.out.printf("%s likes eat %s \n", super.getName(), super.getFood());
    }

    @Override
    public void sleep() {

    }

}
