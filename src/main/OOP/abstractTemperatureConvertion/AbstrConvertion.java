package main.OOP.abstractTemperatureConvertion;


import java.util.Locale;
import java.util.Scanner;

public class AbstrConvertion {
    public static void main(String[] args) {
        AbstrConverter abstrFahrenheitConverter = new AbstrFahrenheitConverter();
        AbstrKelvinConverter abstrKelvinConverter = new AbstrKelvinConverter();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Пожалуйста введите температуру в Цельсиях");
        double temperature = scanner.nextDouble();
        System.out.println("Температура в Цельсиях: " + temperature);
        double kelvin = abstrKelvinConverter.convert(temperature);
        System.out.println("Температура в Кельвинах: " + kelvin);
        double fahrenheit = abstrFahrenheitConverter.convert(temperature);
        System.out.println("Температура в Фаренгейтах: " + fahrenheit);
    }
}
