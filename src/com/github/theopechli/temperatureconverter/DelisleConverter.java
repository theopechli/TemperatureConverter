package com.github.theopechli.temperatureconverter;

public class DelisleConverter extends Converter {
    @Override
    public double getCelsius(double de) {
        return 100 - de * 2 / 3;
    }
}
