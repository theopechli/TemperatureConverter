package io.github.theopechli.converter.temperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Convert from:\n(1) Celsius\n(2) Fahrenheit\n" +
                "(3) Kelvin\n(4) Rankine\n> ");
        int convertFrom = scanner.nextInt();

        while (convertFrom < 1 || convertFrom > 4) {
            System.out.print("A valid integer must be provided. [1-4]\n> ");
            convertFrom = scanner.nextInt();
        }

        System.out.print("Convert to:\n(1) Celsius\n(2) Fahrenheit\n" +
                "(3) Kelvin\n(4) Rankine\n> ");
        int convertTo = scanner.nextInt();

        while (convertTo < 1 || convertTo > 4) {
            System.out.print("A valid integer must be provided. [1-4]\n> ");
            convertTo = scanner.nextInt();
        }

        System.out.print("Input the temperature to be converted.\n> ");
        double temp = scanner.nextDouble();

        Converter converter = null;

        switch (convertFrom) {
            case 1:
                converter = new CelsiusConverter();
                converter.setConvertFrom("Celsius");
                break;
            case 2:
                converter = new FahrenheitConverter();
                converter.setConvertFrom("Fahrenheit");
                break;
            default:
        }

        switch (convertTo) {
            case 1:
                converter.setConvertTo("Celsius");
                break;
            case 2:
                converter.setConvertTo("Fahrenheit");
                break;
            case 3:
                converter.setConvertTo("Kelvin");
                break;
            case 4:
                converter.setConvertTo("Rankine");
                break;
            default:
        }

        System.out.println("Temperature " + temp + " "
                + converter.getConvertFrom() + " converted to "
                + converter.convertTemp(temp) + " "
                + converter.getConvertTo());
    }
}
