package cscsrc;

import java.util.Scanner;

public class Mod5_Opt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize arrays to store monthly temperatures
        double[] temperatures = new double[12];
        String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };

        // Input temperatures for each month
        for (int i = 0; i < 12; i++) {
            System.out.print("Enter temperature for " + months[i] + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        // Calculate yearly average temperature
        double totalTemperature = 0;
        for (double temp : temperatures) {
            totalTemperature += temp;
        }
        double yearlyAverage = totalTemperature / 12;

        // Find highest and lowest monthly averages
        double highest = temperatures[0];
        double lowest = temperatures[0];
        for (double temp : temperatures) {
            if (temp > highest) {
                highest = temp;
            }
            if (temp < lowest) {
                lowest = temp;
            }
        }

        // Prompt user for month or "year"
        System.out.print("Enter a month (e.g., January) or 'year': ");
        String input = scanner.next();

        if (input.equalsIgnoreCase("year")) {
            System.out.println("Yearly average temperature: " + yearlyAverage);
            System.out.println("Highest monthly average: " + highest);
            System.out.println("Lowest monthly average: " + lowest);
        } else {
            // Find the index of the entered month
            int monthIndex = -1;
            for (int i = 0; i < 12; i++) {
                if (months[i].equalsIgnoreCase(input)) {
                    monthIndex = i;
                    break;
                }
            }

            if (monthIndex != -1) {
                double monthTemp = temperatures[monthIndex];
                System.out.println("Temperature for " + months[monthIndex] + ": " + monthTemp);
            } else {
                System.out.println("Invalid input. Please enter a valid month or 'year'.");
            }
        }

        scanner.close();
    }
}
