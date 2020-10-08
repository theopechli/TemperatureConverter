package com.github.theopechli.temperatureconverter;

public class KelvinConverter extends Converter {
    @Override
    public double getCelsius(double k) {
        return k - 273.15;
    }
}
