package com.github.theopechli.temperatureconverter;

public class RomerConverter extends Converter {
    @Override
    public double getCelsius(double ro) {
        return (ro - 7.5) * 40 / 21;
    }
}
