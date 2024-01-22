package N2Callback;

public class PaymentPayPal extends Payment{
    private final String email;
    private final String password;

    public PaymentPayPal(String email, String password, float amount){
        this.email = email;
        this.password = password;
        this.amount = amount;
    }
    @Override
    public void execute() {
        System.out.println("Payment of " + amount + "€ made with paypal.");
    }
}
