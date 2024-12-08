public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice", 1500);
        BankAccount account2 = new BankAccount("Bob", 800);

        account1.printTransactionHistory();
        account2.printTransactionHistory();

        System.out.println("\nTrying to transfer $500 from Alice to Bob:");
        account1.transferMoney(account2, 500);

        System.out.println("\nUpdated transaction histories:");
        account1.printTransactionHistory();
        account2.printTransactionHistory();

        System.out.println("\nLocking Alice's account:");
        account1.lockAccount();
        System.out.println("Trying to transfer $200 from Alice to Bob:");
        account1.transferMoney(account2, 200);

        System.out.println("\nUnlocking Alice's account:");
        account1.unlockAccount();
        System.out.println("Trying to transfer $200 from Alice to Bob:");
        account1.transferMoney(account2, 200);

        double depositAmount = 1000;
        int months = 12;
        double finalAmount = account1.depositCalculator(depositAmount, months);
        System.out.println("\nDeposit of $" + depositAmount + " for " + months + " months will grow to $" + finalAmount);
    }
}
