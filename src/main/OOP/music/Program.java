package main.OOP.music;

public class Program {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[5];
        instruments[0] = new Guitar(4);
        instruments[1] = new Drum(2.5f);
        instruments[2] = new Trumpet(5.7f);
        instruments[3] = new Guitar(6);
        instruments[4] = new Trumpet(7.1f);
        for (Instrument i: instruments) {
            i.play();
        }
    }
}
