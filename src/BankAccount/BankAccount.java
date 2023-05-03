package BankAccount;

public class BankAccount {
    private double balance;
    private boolean open = true;
    public BankAccount open() {
        return new BankAccount();
    }
    public void close() {
        open = false;
    }

    public double getBalance() throws BankAccountActionInvalidException {
        checkIfOpen();
        return balance;
    }

    public synchronized void deposit(double amount) throws BankAccountActionInvalidException {
        checkIfNegative(amount);
        checkIfOpen();
        balance += amount;
    }
    private void checkIfOpen() throws BankAccountActionInvalidException {
        if (!open) {
            throw new BankAccountActionInvalidException("Account closed");
        }
    }
    public synchronized void withdraw(double amount) throws BankAccountActionInvalidException {
        checkIfNegative(amount);
        checkIfOpen();
        if (balance == 0) {
            throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
        }
        if (amount > balance) {
            throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
        }
        balance -= amount;
    }
    private void checkIfNegative(double amount) throws BankAccountActionInvalidException {
        if (amount < 0) {
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        }
    }
}
class BankAccountActionInvalidException extends Exception {

    BankAccountActionInvalidException(String message) {
        super(message);
    }
}
