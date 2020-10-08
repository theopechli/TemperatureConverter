package io.github.theopechli.converter.temperature;

public class FahrenheitConverter extends Converter {
    @Override
    public double getCelsius(double f) {
        return (f - 32) * 5/9;
    }
}
