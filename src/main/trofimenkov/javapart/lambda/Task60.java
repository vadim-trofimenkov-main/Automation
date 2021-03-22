package main.trofimenkov.javapart.lambda;

import java.util.Locale;
import java.util.Scanner;

//Задача 60. Лямбда-функции. Конвертер температур
//Нужно:
//а) решить Задачу 13 Конвертер температур с помощью лямбда-фукнций.
//Кельвины = Цельсий + 273.15
//Фаренгейты = Цельсий х 1.8 + 32


public class Task60 {
    public static void main(String[] args) {
        double temperature = enterTemperature();
        Converter fahrenheit = value -> value = value * 1.8 + 32;
        Converter kelvin = value -> value += 273.15;
        System.out.println("Converted value to fahrenheit: " + fahrenheit.convert(temperature));
        System.out.println("Converted value to kelvin: " + kelvin.convert(temperature));
    }

    public interface Converter {
        double convert(double d);
    }

    public static double enterTemperature() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double value;
        //     do {
        System.out.println("Please enter temperature as double digital value(x.x format): ");
        value = scanner.nextDouble();
//        } while (isDouble(value)){
//            System.out.println("Error: The value is in wrong format or is not digital");
//            System.out.println("Please enter temperature as double digital value(x.x format): ");
//            value = scanner.nextDouble();
//        }
        return value;
    }
}
