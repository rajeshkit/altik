package pkg;

public class Payment {
    private int paymentId;
    private int amount;
    private String bankName;

    public Payment(int paymentId, int amount, String bankName) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.bankName = bankName;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public int getAmount() {
        return amount;
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", amount=" + amount +
                ", bankName='" + bankName + '\'' +
                '}';
    }


}
