package N2Callback;

public class ShopMethods {
    public static PaymentBank askPaymentBank(float amount){
        return new PaymentBank(Input.getInt("Insert iban number:"), Input.getString("Account owner name:"), Input.getString("Account owner surname:"), amount);
    }
    public static PaymentPayPal askPaymentPaypal(float amount){
        return new PaymentPayPal(Input.getString("Write email:"), Input.getString("Write password:"), amount);
    }
    public static PaymentCreditCard askPaymentCreditCard(float amount){
        return new PaymentCreditCard(Input.getString("Card owner name:"), Input.getString("Card owner surname:"),Input.getInt("Card number:"), Input.getInt("Expiration date DDMMYY format:"), Input.getInt("CVV number:"), amount);
    }
}
