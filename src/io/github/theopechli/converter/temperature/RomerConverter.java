package io.github.theopechli.converter.temperature;

public class RomerConverter extends Converter {
    @Override
    public double getCelsius(double ro) {
        return (ro - 7.5) * 40 / 21;
    }
}
