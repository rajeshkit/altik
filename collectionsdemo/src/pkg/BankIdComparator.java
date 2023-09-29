package pkg;

import java.util.Comparator;

public class BankIdComparator implements Comparator<Payment> {
    @Override
    public int compare(Payment o1, Payment o2) {
        return o1.getPaymentId()-o2.getPaymentId();
    }
}
