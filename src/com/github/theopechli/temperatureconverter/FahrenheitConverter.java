package com.github.theopechli.temperatureconverter;

public class FahrenheitConverter extends Converter {
    @Override
    public double getCelsius(double f) {
        return (f - 32) * 5/9;
    }
}
