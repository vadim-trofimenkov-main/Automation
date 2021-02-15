package main.OOP.abstractTemperatureConvertion;

public class AbstrFahrenheitConverter extends AbstrConverter {

    @Override
    double convert(double d) {
        d = d * 1.8 + 32;
        return d;
    }
}
