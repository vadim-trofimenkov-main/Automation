package main.trofimenkov.javapart.OOP.music;

public class Drum implements Instrument{
    private float size;

    public Drum(float size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.printf("Барабан %.1f размера играет ноту %s \n", size, Instrument.KEY);
    }
}
