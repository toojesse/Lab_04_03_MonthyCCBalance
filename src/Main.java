public class Main {
    public static void main(String[] args) {
        double startingBalance = 5000.00;
        double annualInterestRate = 0.17;
        double monthlyInterestRate = annualInterestRate / 12.0;

        // Month 1
        double month1Interest = startingBalance * monthlyInterestRate;
        double balanceAfterMonth1 = startingBalance + month1Interest;

        // Month 2
        double month2Interest = balanceAfterMonth1 * monthlyInterestRate;

        System.out.println("Starting Credit Card Balance: $" + startingBalance);
        System.out.println("Interest due after month 1: $" + month1Interest);
        System.out.println("Interest due after month 2: $" + month2Interest);
    }
}