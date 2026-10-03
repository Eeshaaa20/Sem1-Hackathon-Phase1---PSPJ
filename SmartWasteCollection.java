public class SmartWasteCollection {

    public static void main(String[] args) {

        

        int vehicleNumber = 108;
        double wasteCollected = 426.75;
        int collectionPoints = 15;
        char vehicleStatus = 'A';

        

        double averageWaste = wasteCollected / collectionPoints;

        int efficiencyScore;

        if (averageWaste >= 30) {
            efficiencyScore = 95;
        } else if (averageWaste >= 20) {
            efficiencyScore = 80;
        } else {
            efficiencyScore = 65;
        }

        
        String statusMessage;

        if (vehicleStatus == 'A') {
            statusMessage = "ACTIVE - Collection in progress";
        } else {
            statusMessage = "INACTIVE - Vehicle unavailable";
        }

        
        String loadLevel;

        if (wasteCollected >= 400) {
            loadLevel = "CRITICAL";
        } else if (wasteCollected >= 250) {
            loadLevel = "HIGH";
        } else {
            loadLevel = "NORMAL";
        }

        

        System.out.println();
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║       ♻ SMART WASTE COMMAND CENTER ♻     ║");
        System.out.println("╠══════════════════════════════════════════╣");

        System.out.println("║ Vehicle Number     : " + vehicleNumber);
        System.out.println("║ Waste Collected    : " + wasteCollected + " kg");
        System.out.println("║ Collection Points  : " + collectionPoints);
        System.out.println("║ Vehicle Status     : " + vehicleStatus);
        System.out.println("║ Status             : " + statusMessage);

        System.out.println("╠══════════════════════════════════════════╣");

        System.out.printf("║ Avg Waste/Point    : %.2f kg%n", averageWaste);
        System.out.println("║ Load Level         : " + loadLevel);
        System.out.println("║ Efficiency Score   : " + efficiencyScore + "/100");

        System.out.println("╠══════════════════════════════════════════╣");

        if (loadLevel.equals("CRITICAL")) {
            System.out.println("║ ⚠ ACTION: Send vehicle to disposal hub");
        } else if (loadLevel.equals("HIGH")) {
            System.out.println("║ ⚠ ACTION: Monitor vehicle capacity");
        } else {
            System.out.println("║ ✓ ACTION: Continue collection route");
        }

        System.out.println("╠══════════════════════════════════════════╣");
        System.out.println("║       CLEAN CITY • SMART FUTURE          ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println();
    }
}