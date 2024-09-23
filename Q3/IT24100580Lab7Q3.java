import java.util.Scanner;
public class IT24100580Lab7Q3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double DISCOUNT_RATE = 0.05;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);
            System.out.print("Enter total bill amount: ");
            double bill = scanner.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char mode = scanner.next().toUpperCase().charAt(0);

            if (mode == 'C') {
                double discount = bill * DISCOUNT_RATE;
                bill -= discount;
                System.out.println("Discount is: $" + discount);
            } else if (mode == 'O') {
                System.out.println("No discount applicable");
            } else {
                System.out.println("Payment Mode is Not Valid");
                i--; 
                continue;
            }

            System.out.println("Amount to be paid: $" + bill);
            System.out.println();
        }

        
    }
}