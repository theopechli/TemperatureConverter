package io.github.theopechli.converter.temperature;

public class NewtonConverter extends Converter {
    @Override
    public double getCelsius(double n) {
        return n * 100 / 33;
    }
}
