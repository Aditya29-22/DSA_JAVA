import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            int balance = 5000;
            Scanner sc = new Scanner(System.in);
            int withdraw = sc.nextInt();
            if (balance < withdraw) {
                throw new ArithmeticException("Insufficient balance");
            }

            int result = balance - withdraw;
            System.out.println("Remaining balance: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Transaction completed");
        }
    }
}
