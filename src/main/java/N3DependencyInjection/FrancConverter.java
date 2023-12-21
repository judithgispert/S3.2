package N3DependencyInjection;

public class FrancConverter implements CoinConverter{
    @Override
    public double convertCoin(double price) {
        return price * 0.94;
    }
}
