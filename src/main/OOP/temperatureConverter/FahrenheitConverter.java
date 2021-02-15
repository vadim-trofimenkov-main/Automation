package main.OOP.temperatureConverter;

public class FahrenheitConverter implements Converter {
    @Override
    public double convert(double d) {
        d = d * 1.8 + 32;
        return d;
    }
}
