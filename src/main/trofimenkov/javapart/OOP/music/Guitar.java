package main.trofimenkov.javapart.OOP.music;

public class Guitar implements Instrument{
    private int numberOfStrings;

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.printf("Гитара c %d струнами играет ноту %s \n", numberOfStrings, Instrument.KEY);
    }
}
