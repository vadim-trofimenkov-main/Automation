package main.OOP.temperatureConverter;

import java.util.Locale;
import java.util.Scanner;

public class Convertion {
    public static void main(String[] args) {
        KelvinConverter kelvinConverter = new KelvinConverter();
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Пожалуйста введите температуру в Цельсиях");
        double temperature = scanner.nextDouble();
        System.out.println("Температура в Цельсиях: " + temperature);
        double kelvin = kelvinConverter.convert(temperature);
        System.out.println("Температура в Кельвинах: " + kelvin);
        double fahrenheit = fahrenheitConverter.convert(temperature);
        System.out.println("Температура в Фаренгейтах: " + fahrenheit);
    }
}