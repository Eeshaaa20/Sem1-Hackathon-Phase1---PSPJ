import java.util.Scanner;

public class TotalWaste {

    // Method to calculate total waste
    static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter waste from Point 1 (kg): ");
        double point1 = sc.nextDouble();

        System.out.print("Enter waste from Point 2 (kg): ");
        double point2 = sc.nextDouble();

        // Calling the method
        double total = calculateTotalWaste(point1, point2);

        System.out.println("Total Waste Collected: " + total + " kg");

        sc.close();
    }
}