import java.util.Scanner;

public class CafeLoyaltyBilling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String membership;
        int numItems;
        int dayNumber;
        double total = 0.0;
        double discountRate = 0.0;
        double surcharge = 0.0;

        System.out.print("Enter membership type (Gold/Silver/None): ");
        membership = sc.nextLine();

        membership = membership.toLowerCase();

        while (!membership.equals("gold") && !membership.equals("silver") && !membership.equals("none")) {

            System.out.print("Enter membership type (Gold/Silver/None): ");
            membership = sc.nextLine();

        }

        System.out.print("Enter day of week (1=Mon ... 7=Sun): ");
        dayNumber = sc.nextInt();

        while(dayNumber < 1 || dayNumber > 7){

        System.out.print("Enter day of week (1=Mon ... 7=Sun): ");
        dayNumber = sc.nextInt();


        }

        System.out.print("How many items did you buy? ");
        numItems = sc.nextInt();

        while(numItems <= 0){

        System.out.print("How many items did you buy? ");
        numItems = sc.nextInt();

        }

        for (int i = 0; i < numItems; i++) {
            System.out.print("Enter price of item " + (i+1) + ": ");
            double price = sc.nextDouble();
            while (price < 0) {
                
                System.out.print("Enter price of item " + (i+1) + ": ");
                price = sc.nextDouble();

            }
            total = total + price;
        }

        // Weekend service surcharge
        switch (dayNumber) {
            case 6:
                surcharge = 1.50;
                break;
            case 7:
                surcharge = 2.00;
                break;
            default:
                surcharge = 0.0;
        }

        // Member discount
        if (membership.equals("gold")) {
            discountRate = 0.20;
        } else if (membership.equals("silver")) {
            discountRate = 0.10;
        } else {
            discountRate = 0;
        }

        total = total * discountRate;
        total = total + surcharge;

        double average = total / numItems;

        String tier;
        if (total > 50) {
            tier = "Large order";
        } else if (total > 20) {
            tier = "Medium order";
        } else {
            tier = "Small order";
        }

        System.out.println("----- RECEIPT -----");
        System.out.printf("Membership: %s\n", membership);
        System.out.printf("Items bought: %d\n", numItems);
        System.out.printf("Amount due: %f\n", total);
        System.out.printf("Average per item: %.2f\n", average);
        System.out.println("Order size: " + tier);
        sc.close();
    }
}