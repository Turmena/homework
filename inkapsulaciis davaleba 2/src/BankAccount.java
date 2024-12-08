import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountHolderName;
    private double balance;
    private boolean accountLock;
    private List<String> transactionHistory;

    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.accountLock = true; // Default account is unlocked
        this.transactionHistory = new ArrayList<>();
        this.transactionHistory.add("Account created with balance: $" + initialBalance);
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History for " + accountHolderName + ":");
        for (String transaction : transactionHistory) {
            if (transaction != null) {
                System.out.println(transaction);
            }
        }
    }

    public boolean transferMoney(BankAccount targetAccount, double amount) {
        if (!accountLock) {
            System.out.println("Account is locked. Transaction denied.");
            return false;
        }
        if (amount > 1000) {
            System.out.println("Transfer limit exceeded. Cannot transfer more than $1000.");
            return false;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds. Transaction denied.");
            return false;
        }

        this.balance -= amount;
        targetAccount.receiveMoney(amount);

        String transaction = "Transferred $" + amount + " to " + targetAccount.getAccountHolderName();
        this.transactionHistory.add(transaction);

        targetAccount.getTransactionHistory().add("Received $" + amount + " from " + this.accountHolderName);

        return true;
    }

    private void receiveMoney(double amount) {
        this.balance += amount;
    }

    public void lockAccount() {
        this.accountLock = false;
        System.out.println("Account locked.");
    }

    public void unlockAccount() {
        this.accountLock = true;
        System.out.println("Account unlocked.");
    }

    public double depositCalculator(double depositAmount, int months) {
        double total = depositAmount;
        for (int i = 0; i < months; i++) {
            total += total * 0.01;
        }
        return total;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }
}
