package com.github.theopechli.temperatureconverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        int unit = 0;

        do {
            System.out.print("Provide an integer in the range of [1-8]" +
                    " to convert from:\n(1) Celsius\n(2) Fahrenheit\n" +
                    "(3) Kelvin\n(4) Rankine\n(5) Delisle\n(6) Newton\n" +
                    "(7) Reaumur\n(8) Romer\n> ");

            try {
                input = scanner.nextLine();
                unit = Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("Invalid input.");
            }
        } while (unit < 1 || unit > 8);

        double temperature = 0;

        do {
            System.out.print("Input the temperature to be converted.\n> ");

            try {
                input = scanner.nextLine();
                temperature = Double.parseDouble(input);
                break;
            } catch (Exception e) {
                System.out.println("A valid decimal must be provided");
            }
        } while(true);

        scanner.close();

        Converter converter = null;

        switch (unit) {
            case 1:
                converter = new CelsiusConverter();
                break;
            case 2:
                converter = new FahrenheitConverter();
                break;
            case 3:
                converter = new KelvinConverter();
                break;
            case 4:
                converter = new RankineConverter();
                break;
            case 5:
                converter = new DelisleConverter();
                break;
            case 6:
                converter = new NewtonConverter();
                break;
            case 7:
                converter = new ReaumurConverter();
                break;
            case 8:
                converter = new RomerConverter();
                break;
            default:
                break;
        }

        double c = converter.getCelsius(temperature);

        System.out.println(c + " Celsius\n"
                + converter.getFahrenheit(c) + " Fahrenheit\n"
                + converter.getKelvin(c) + " Kelvin\n"
                + converter.getRankine(c) + " Rankine\n"
                + converter.getDelisle(c) + " Delisle\n"
                + converter.getNewton(c) + " Newton\n"
                + converter.getReaumur(c) + " Reaumur\n"
                + converter.getRomer(c) + " Romer");
    }
}
