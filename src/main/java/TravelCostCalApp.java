import java.util.Scanner;

public class TravelCostCalApp {
    public static void main(String[] args) {
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of kilometers to travel
        System.out.print("Enter the distance to travel (in kilometers): ");
        double distance = scanner.nextDouble();

        // Ask the user for the fuel price per liter
        System.out.print("Enter the fuel price per liter: ");
        double fuelPricePerLiter = scanner.nextDouble();

        // Fixed fuel consumption rate (5 liters per 100 km)
        final double FUEL_CONSUMPTION_RATE = 5.0;
        final double DISTANCE_PER_100_KM = 100.0;

        // Calculate the total fuel needed for the trip
        double fuelNeeded = (distance / DISTANCE_PER_100_KM) * FUEL_CONSUMPTION_RATE;

        // Calculate the total cost of the trip
        double totalCost = fuelNeeded * fuelPricePerLiter;

        // Display the result
        System.out.printf("For a trip of %.2f kilometers, you will need %.2f liters of fuel.\n", distance, fuelNeeded);
        System.out.printf("The total cost of the trip will be: %.2f\n", totalCost);

        // Close the scanner
        scanner.close();
    }
}

