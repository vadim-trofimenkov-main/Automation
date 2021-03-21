package main.trofimenkov.javapart.OOP.music;

public class Trumpet implements Instrument{
    private float diameter;

    public Trumpet(float diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.printf("Труба диаметром %.1f играет ноту %s \n", diameter, Instrument.KEY);
    }
}
