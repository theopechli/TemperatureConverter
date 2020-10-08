package com.github.theopechli.temperatureconverter;

public class RankineConverter extends Converter {
    @Override
    public double getCelsius(double r) {
        return (r - 491.67) * 5/9;
    }
}
