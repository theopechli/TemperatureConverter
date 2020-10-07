package io.github.theopechli.converter.temperature;

public abstract class Converter {
    private String convertFrom;
    private String convertTo;

    public void setConvertFrom(String unit) {
        this.convertFrom = unit;
    }

    public void setConvertTo(String unit) {
        this.convertTo = unit;
    }

    public String getConvertFrom() {
        return convertFrom;
    }

    public String getConvertTo() {
        return convertTo;
    }

    public abstract double convertTemp(double temp);
}
