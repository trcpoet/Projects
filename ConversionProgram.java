
import java.util.Scanner;

public class ConversionProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distance;

        // Enter a distance in meters
        do {
            System.out.print("Enter a distance in meters: ");
            distance = input.nextDouble();
        } while (distance < 0);

        int choice;
        do {

            menu();

            // Get the user's choice
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            // Process the user's choice
            switch (choice) {
                case 1:
                    showKilometers(distance);
                    break;
                case 2:
                    showInches(distance);
                    break;
                case 3:
                    showFeet(distance);
                    break;
                case 4:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
    }

    public static void showKilometers(double meters) {
        double kilometers = meters * 0.001;
        System.out.printf("%.2f meters is %.2f kilometers.\n", meters, kilometers);
    }

    public static void showInches(double meters) {
        double inches = meters * 39.37;
        System.out.printf("%.2f meters is %.2f inches.\n", meters, inches);
    }

    public static void showFeet(double meters) {
        double feet = meters * 3.281;
        System.out.printf("%.2f meters is %.2f feet.\n", meters, feet);
    }

    public static void menu() {
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
    }
}


