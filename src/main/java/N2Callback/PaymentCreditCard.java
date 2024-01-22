package N2Callback;

public class PaymentCreditCard extends Payment{
    private final String name;
    private final String surname;
    private final int cardNumber;
    private final int expirationDate;
    private final int cvv;

    public PaymentCreditCard(String name, String surname, int cardNumber, int expirationDate, int cvv, float amount){
        this.name = name;
        this.surname = surname;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.amount = amount;
    }

    @Override
    public void execute() {
        System.out.println("Payment of " + amount + "€ made with credit card.");
    }
}
