package N3DependencyInjection;

public class DollarConverter implements CoinConverter{
    @Override
    public double convertCoin(double price) {
      return price * 1.09;
    }
}
