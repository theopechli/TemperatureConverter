package io.github.theopechli.converter.temperature;

public class DelisleConverter extends Converter {
    @Override
    public double getCelsius(double de) {
        return 100 - de * 2 / 3;
    }
}
