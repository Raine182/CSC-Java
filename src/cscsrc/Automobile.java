package cscsrc;

import java.util.Scanner;
import java.util.Arrays;

public class Automobile {
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    // Default constructor
    public Automobile() {
        this.make = "";
        this.model = "";
        this.color = "";
        this.year = 0;
        this.mileage = 0;
    }

    // Parameterized constructor
    public Automobile(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    // Add a new vehicle method
    public String addVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle added successfully!";
        } catch (Exception e) {
            return "Failed to add vehicle: " + e.getMessage();
        }
    }

    // List vehicle information method
    public String[] listVehicleInformation() {
        return new String[]{this.make, this.model, this.color, String.valueOf(this.year), String.valueOf(this.mileage)};
    }

    // Remove a vehicle method
    public String removeVehicle() {
        try {
            this.make = "";
            this.model = "";
            this.color = "";
            this.year = 0;
            this.mileage = 0;
            return "Vehicle removed successfully!";
        } catch (Exception e) {
            return "Failed to remove vehicle: " + e.getMessage();
        }
    }

    // Update vehicle attributes method
    public String updateVehicleAttributes(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle updated successfully!";
        } catch (Exception e) {
            return "Failed to update vehicle: " + e.getMessage();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Automobile auto = new Automobile();

        while (true) {
            System.out.println("\n--- Automobile Management Menu ---");
            System.out.println("1. Add a vehicle");
            System.out.println("2. List vehicle information");
            System.out.println("3. Remove a vehicle");
            System.out.println("4. Update vehicle attributes");
            System.out.println("5. Exit");
            System.out.print("Enter your a number (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter make: ");
                    String make = scanner.nextLine();
                    
                    System.out.print("Enter model: ");
                    String model = scanner.nextLine();
                    
                    System.out.print("Enter color: ");
                    String color = scanner.nextLine();
                    
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    
                    System.out.print("Enter mileage: ");
                    int mileage = scanner.nextInt();
                    
                    System.out.println(auto.addVehicle(make, model, color, year, mileage));
                    break;
                case 2:
                    System.out.println(Arrays.toString(auto.listVehicleInformation()));
                    break;
                case 3:
                    System.out.println(auto.removeVehicle());
                    break;
                case 4:
                    System.out.print("Enter new make: ");
                    String newMake = scanner.nextLine();
                    
                    System.out.print("Enter model: ");
                    String newmodel = scanner.nextLine();
                    
                    System.out.print("Enter color: ");
                    String newcolor = scanner.nextLine();
                    
                    System.out.print("Enter year: ");
                    int newyear = scanner.nextInt();
                    
                    System.out.print("Enter mileage: ");
                    int newmileage = scanner.nextInt();
                    
                    // Similar input prompts for other attributes
                    System.out.println(auto.updateVehicleAttributes(newMake, newmodel, newcolor, newyear, newmileage));
                    break;
                case 5:
                    System.out.println("Program Terminated");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please select 1-5.");
            }
        }
    }
}

