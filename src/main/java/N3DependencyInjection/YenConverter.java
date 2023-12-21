package N3DependencyInjection;

public class YenConverter implements CoinConverter{
    @Override
    public double convertCoin(double price) {
        return price * 156;
    }
}
