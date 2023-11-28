package N1Observer;

public class GermanyStockExchange extends StockExchangeAgency{
    private float value = 33.21f;

    public GermanyStockExchange(StockExchangeBroker broker){
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
        System.out.println("The value of Germany stock exchange shares is: " + (value * broker.getStatus()));
    }
}
