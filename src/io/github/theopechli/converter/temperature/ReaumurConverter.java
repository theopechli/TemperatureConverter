package io.github.theopechli.converter.temperature;

public class ReaumurConverter extends Converter {
    @Override
    public double getCelsius(double re) {
        return re * 5 / 4;
    }
}
