package main.OOP.animal;

public class Cat extends Animal {

    private boolean isAccustomedToTray;                                  //приучен к лотку?
    public Cat(String name, String food, String location, boolean isAccustomedToTray) {
        super(name, food, location);
        this.isAccustomedToTray = isAccustomedToTray;
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
