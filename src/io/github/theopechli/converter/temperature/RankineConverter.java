package io.github.theopechli.converter.temperature;

public class RankineConverter extends Converter {
    @Override
    public double getCelsius(double r) {
        return (r - 491.67) * 5/9;
    }
}
