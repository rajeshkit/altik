public class Payment implements Comparable<Payment>{
    private int paymentId;
    private int amount;
    private String bankName;

    public Payment(int paymentId, int amount, String bankName) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", amount=" + amount +
                ", bankName='" + bankName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Payment o) {
//        if(this.amount>o.amount){
//            return 1;
//        }
//        if(this.amount<o.amount){
//            return -1;
//        }
        return this.bankName.compareTo(o.bankName);
    }
}
