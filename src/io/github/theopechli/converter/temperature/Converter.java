package io.github.theopechli.converter.temperature;

public abstract class Converter {
    public abstract double getCelsius(double temperature);

    public double getFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public double getKelvin(double c) {
        return c + 273.15;
    }

    public double getRankine(double c) {
        return (c + 273.15) * 9 / 5;
    }

    public double getDelisle(double c) {
        return (100 - c) * 3 / 2;
    }

    public double getNewton(double c) {
        return c * 33 / 100;
    }

    public double getReaumur(double c) {
        return c * 4 / 5;
    }

    public double getRomer(double c) {
        return c * 21 / 40 + 7.5;
    }
}
