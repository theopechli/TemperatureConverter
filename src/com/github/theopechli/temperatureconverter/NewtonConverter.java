package com.github.theopechli.temperatureconverter;

public class NewtonConverter extends Converter {
    @Override
    public double getCelsius(double n) {
        return n * 100 / 33;
    }
}
