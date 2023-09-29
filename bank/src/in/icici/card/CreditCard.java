package in.icici.card;


import in.icici.account.SavingAccount;

public class CreditCard extends SavingAccount {
    public void show(){

        System.out.println(accountNumber);
        System.out.println(name);
    }
}
