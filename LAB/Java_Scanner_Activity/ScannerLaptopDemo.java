import java.util.Scanner;

public class ScannerLaptopDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            // Display options to the user
            System.out.println("Enter Option:");
            System.out.println("Add-1");
            System.out.println("Subtract-2");
            System.out.println("Multiply-3");
            System.out.println("Even/OddNumber-4");
            System.out.println("Quit-5");

            // Read user input
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter two numbers to be added:");
                    int addNum1 = scanner.nextInt();
                    int addNum2 = scanner.nextInt();
                    int addResult = addNum1 + addNum2;
                    System.out.println("The result is " + addResult);
                    break;

                case 2:
                    System.out.println("Enter two numbers to be subtracted:");
                    int subNum1 = scanner.nextInt();
                    int subNum2 = scanner.nextInt();
                    int subResult = subNum1 - subNum2;
                    System.out.println("The result is " + subResult);
                    break;

                case 3:
                    System.out.println("Enter two numbers to be multiplied:");
                    int mulNum1 = scanner.nextInt();
                    int mulNum2 = scanner.nextInt();
                    int mulResult = mulNum1 * mulNum2;
                    System.out.println("The result is " + mulResult);
                    break;

                case 4:
                    System.out.println("Enter a number to check even or odd:");
                    int num = scanner.nextInt();
                    String evenOddResult = (num % 2 == 0) ? "Even" : "Odd";
                    System.out.println("The number is " + evenOddResult);
                    break;

                case 5:
                    System.out.println("Terminating the program.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }

        } while (option != 5);

        // Close the scanner
        scanner.close();
    }
}
