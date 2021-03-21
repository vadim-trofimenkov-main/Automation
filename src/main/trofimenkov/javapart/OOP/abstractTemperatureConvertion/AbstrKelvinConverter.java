package main.trofimenkov.javapart.OOP.abstractTemperatureConvertion;

public class AbstrKelvinConverter extends AbstrConverter {

    @Override
    double convert(double d) {
        d += 273.15;
        return d;
    }
}
