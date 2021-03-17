package main.OOP.music1;

public class Main {
    public static void main(String[] args) {
        Instrument drum = () -> System.out.printf("Барабан играет ноту %s \n", Instrument.KEY);
        Instrument guitar = () -> System.out.printf("Гитара играет ноту %s \n", Instrument.KEY);
        Instrument trumpet = () -> System.out.printf("Труба играет ноту %s \n", Instrument.KEY);
        drum.play();
        guitar.play();
        trumpet.play();
    }
}
