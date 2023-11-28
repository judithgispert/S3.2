package N1Observer;

public class Main {
    public static void main (String[]args){
        StockExchangeBroker broker = new StockExchangeBroker();

        new GermanyStockExchange(broker);
        new SpainStockExchange(broker);

        System.out.println("You bought 35 stock exchange shares.");
        broker.setStatus(35);
        System.out.println("");
        System.out.println("You bought 200 stock exchange shares.");
        broker.setStatus(200);
    }
}
