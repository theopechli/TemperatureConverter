package io.github.theopechli.converter.temperature;

public class CelsiusConverter extends Converter {
    @Override
    public double convertTemp(double temp) {
        return (temp - 32) * 5/9;
    }
}
