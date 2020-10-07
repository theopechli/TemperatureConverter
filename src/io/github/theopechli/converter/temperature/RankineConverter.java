package io.github.theopechli.converter.temperature;

public class RankineConverter extends Converter {
    @Override
    public double convertTemp(double temp) {
        return temp * 9/5 + 32;
    }
}
