public class Payment {
    private int paymentId;
    private String paymentDate;
    private int billAmount;
    private boolean status;
    Payment(){

    }
    public Payment(int paymentId, String paymentDate, int billAmount, boolean status) {
        this.paymentId = paymentId;
        this.paymentDate = paymentDate;
        this.billAmount = billAmount;
        this.status = status;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(int billAmount) {
        this.billAmount = billAmount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
