package io.github.theopechli.converter.temperature;

public class KelvinConverter extends Converter {
    @Override
    public double getCelsius(double k) {
        return k - 273.15;
    }
}
