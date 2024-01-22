package N2Callback;

public class PaymentBank extends Payment{
    private final int iban;
    private final String name;
    private final String surname;

    public PaymentBank(int iban, String name, String surname, float amount){
        this.iban = iban;
        this.name = name;
        this.surname = surname;
        this.amount = amount;
    }

    @Override
    public void execute() {
        System.out.println("Payment of " + amount + "€ made from the bank account.");
    }
}
