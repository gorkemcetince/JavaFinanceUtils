public class BankAccount {
    private double balance;
    private double fee;
    private int transactionCount;
    private int freeTransactionCount;

    public BankAccount(double balance, int freeTransactionCount) {
        this.balance = balance;
        this.fee = 0.0;
        this.transactionCount = 0;
        this.freeTransactionCount = freeTransactionCount;
    }

    public void setTransactionFee(double fee) {
        this.fee = fee;
    }

    public void deposit(double amount) {
        balance += amount - fee;
        transactionCount++;
    }

    public void withdraw(double amount) {
        balance -= amount + fee;
        transactionCount++;
    }

    public void deductMonthlyCharge() {
        int chargeableTransactions = Math.max(transactionCount - freeTransactionCount, 0);
        balance -= chargeableTransactions * fee;
        transactionCount = 0;
    }

    public double getBalance() {
        return balance;
    }
}
