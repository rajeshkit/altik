package pkg;

import java.util.Comparator;

public class NameComparator implements Comparator<Payment> {
    @Override
    public int compare(Payment o1, Payment o2) {
        return o1.getBankName().compareTo(o2.getBankName());
    }
}
