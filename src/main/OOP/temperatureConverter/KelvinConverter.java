package main.OOP.temperatureConverter;

public class KelvinConverter implements Converter{
    @Override
    public double convert(double d) {
        d += 273.15;
        return d;
    }
}
