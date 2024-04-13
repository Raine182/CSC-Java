package cscsrc;

import java.util.Scanner;

public class mod4_Op1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        double maximum = Double.NEGATIVE_INFINITY;
        double minimum = Double.POSITIVE_INFINITY;
        int count = 0;

        System.out.println("Enter five floating-point values:");
        while (count < 5) {
            try {
                System.out.print("Value " + (count + 1) + ": ");
                double value = scanner.nextDouble();
                total += value;
                maximum = Math.max(maximum, value);
                minimum = Math.min(minimum, value);
                count++;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid floating-point value.");
                scanner.nextLine(); // Clear the input buffer
            }
        }

        double average = total / 5;
        double interest = total * 0.20;

        System.out.println("\nResults:");
        System.out.printf("Total: %.2f%n", total);
        System.out.printf("Average: %.2f%n", average);
        System.out.printf("Maximum: %.2f%n", maximum);
        System.out.printf("Minimum: %.2f%n", minimum);
        System.out.printf("Interest on total at 20%%: %.2f%n", interest);
    }
}