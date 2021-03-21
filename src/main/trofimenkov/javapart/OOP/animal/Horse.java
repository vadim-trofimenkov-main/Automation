package main.trofimenkov.javapart.OOP.animal;

public class Horse extends Animal{

    private boolean isParticipatedInRaces;
    public Horse(String name, String food, String location, boolean isParticipatedInRaces) {
        super(name, food, location);
        this.isParticipatedInRaces = isParticipatedInRaces;
    }

    @Override
    public void makeNoise() {
        System.out.printf("%s спит \n", super.getName());
    }

    @Override
    public void eat() {
        System.out.printf("%s likes eat %s \n", super.getName(), super.getFood());
    }

    @Override
    public void sleep() {

    }
}
