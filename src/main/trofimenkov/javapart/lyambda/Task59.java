package main.trofimenkov.javapart.lyambda;

//Задача 59. Лямбда-функции. Инструменты
//Нужно:
//а) решить Задачу 12 Инструменты с помощью лямбда-фукнций.
public class Task59 {
    public static void main(String[] args) {

        Instrument drum = () -> System.out.printf("Барабан играет ноту %s \n", Instrument.KEY);
        Instrument guitar = () -> System.out.printf("Гитара играет ноту %s \n", Instrument.KEY);
        Instrument trumpet = () -> System.out.printf("Труба играет ноту %s \n", Instrument.KEY);
        drum.play();
        guitar.play();
        trumpet.play();
    }

    interface Instrument {

        String KEY = "До мажор";

        void play();
    }
}
