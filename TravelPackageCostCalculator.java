import java.util.Scanner;

public class TravelPackageCostCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define the base cost of the travel package
        double baseCost = 1000.0; // You can adjust this value

        // Define the additional cost per person
        double costPerPerson = 200.0; // You can adjust this value

        System.out.print("Enter the number of people: ");
        int numberOfPeople = input.nextInt();

        // Calculate the total cost
        double totalCost = baseCost + (numberOfPeople * costPerPerson);

        // Display the results
        System.out.println("Travel Package Cost Calculation");
        System.out.println("Base Cost: $" + baseCost);
        System.out.println("Additional Cost Per Person: $" + costPerPerson);
        System.out.println("Number of People: " + numberOfPeople);
        System.out.println("Total Cost: $" + totalCost);

        input.close();
    }
}
