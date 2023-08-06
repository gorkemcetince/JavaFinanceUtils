public class CashRegister {
    private double taxRate;
    private double purchase;
    private double taxablePurchase;

    public CashRegister(double taxRate) {
        this.taxRate = taxRate;
        this.purchase = 0.0;
        this.taxablePurchase = 0.0;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
    }

    public void recordTaxablePurchase(double amount) {
        taxablePurchase += amount;
    }

    public double getTotalTax() {
        return taxablePurchase * taxRate;
    }

    public void receivePayment(double payment) {
        purchase -= payment;
    }

    public double giveChange() {
        return -purchase;
    }
}