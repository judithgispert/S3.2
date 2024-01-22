package N2Callback;

public class ShopMenu {
    private static int showMenu(){
        return Input.getInt("Select payment method: \r\n"
                + "1. Bank. \r\n"
                + "2. Credit card. \r\n"
                + "3. Paypal. \r\n"
                + "0. Exit app.");
    }

    public static Payment menuPayment(){
        boolean exit = false;
        Payment payment = null;
        switch (showMenu()){
            case 1:
                System.out.println("Option selected payment with bank account.");
                payment = ShopMethods.askPaymentBank(Input.getFloat("Total to pay:"));
                break;
            case 2:
                System.out.println("Option selected payment with credit card.");
                payment = ShopMethods.askPaymentCreditCard(Input.getFloat("Total to pay:"));
                break;
            case 3:
                System.out.println("Option selected payment with paypal.");
                payment = ShopMethods.askPaymentPaypal(Input.getFloat("Total to pay:"));
                break;
            }
        return payment;
    }
    public void pay(){
        Payment payment = menuPayment();
        payment.executeWith(() -> System.out.println("Payment done."));
    }
}
