package Restaurant;

import java.util.Scanner;

public class mod3withholding {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter your weekly income: ");
			double weeklyIncome = scanner.nextDouble();

			double taxWithholding;
			if (weeklyIncome < 500) {
			    taxWithholding = weeklyIncome * 0.10;
			} else if (weeklyIncome < 1500) {
			    taxWithholding = weeklyIncome * 0.15;
			} else if (weeklyIncome < 2500) {
			    taxWithholding = weeklyIncome * 0.20;
			} else {
			    taxWithholding = weeklyIncome * 0.30;
			}

			System.out.printf("Your weekly tax withholding is: $%.2f%n", taxWithholding);
		}
    }
}
