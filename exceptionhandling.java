public class exceptionhandling {
    public static void main(String[] args) {
        try {
            int balance = 5000;
            int withdraw = 10000;
            int result = balance - withdraw;
            System.out.println("Remaining balance: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Insufficient balance");
        } finally {
            System.out.println("Transaction completed");
        }
    }
}