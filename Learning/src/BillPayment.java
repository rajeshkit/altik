public class BillPayment {
    public static void main(String[] args) {
        Payment p1=new Payment();
        p1.setPaymentId(234);
        p1.setBillAmount(5886);
        p1.setPaymentDate("12-12-2023");
        p1.setStatus(true);
        System.out.println(p1.getPaymentId()+" "+p1.getPaymentDate()+" "+p1.getBillAmount()+" "+p1.isStatus());
        Payment p2=new Payment(234,"",4565,true);
    }
}
