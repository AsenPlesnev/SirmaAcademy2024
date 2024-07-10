public class Invoice {
    private final double amount;
    private final String customerName;

    public Invoice(double amount, String customerName) {
        this.amount = amount;
        this.customerName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void printInvoice() {
        System.out.println("Invoice for: " + this.customerName);
        System.out.println("Amount: $" + this.amount);
    }
}
