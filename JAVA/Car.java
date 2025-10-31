/*
 * Example: Classes and Objects in Java
 * -------------------------------------
 * This example demonstrates how to define a class with:
 * - Attributes (data members)
 * - A constructor
 * - Methods (behavior)
 * 
 * Concept Covered: Classes and Objects (Basic Building Blocks of OOP)
 */

public class Car {
    // Attributes (Fields or Properties)
    String manufacturer;
    String model;
    int year;

    // Constructor — used to initialize object attributes
    public Car(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    // Method — represents the behavior of the object
    public void startEngine() {
        System.out.println("🚘 The " + year + " " + manufacturer + " " + model + "'s engine has started.");
    }

    // Method — displays object information
    public void displayInfo() {
        System.out.println("ℹ️ Car Info: " + manufacturer + " " + model + " (" + year + ")");
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating objects (instances of the Car class)
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Tesla", "Model 3", 2024);

        // Accessing methods
        car1.displayInfo();
        car1.startEngine();

        System.out.println(); // Line break

        car2.displayInfo();
        car2.startEngine();
    }
}
