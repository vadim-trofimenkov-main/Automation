package main.trofimenkov.javapart.OOP.animal;

public abstract class Animal {
    private String food;
    private String location;
    private String name;

    public Animal(String name, String food, String location) {
        this.food = food;
        this.location = location;
        this.name = name;
    }

    public abstract void makeNoise();

    public abstract void eat();

    public abstract void sleep();

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
}

