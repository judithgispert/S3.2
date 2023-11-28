package N1Observer;

public class SpainStockExchange extends StockExchangeAgency{
    private float value = 22.90f;

    public SpainStockExchange(StockExchangeBroker broker){
        this.broker = broker;
        this.broker.addAgency(this);
    }

    public float getDropValue(){
        return value;
    }

    public void setDropValue(float value) {
        this.value = value;
    }
    @Override
    public void update() {
        System.out.println("The value of Spain stock exchange shares is: " + (value * broker.getStatus()));
    }
}
