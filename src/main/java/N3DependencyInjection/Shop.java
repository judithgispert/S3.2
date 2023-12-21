package N3DependencyInjection;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    List<Product> productList;
    CoinConverter coinConverter;

    public Shop (List<Product> productList, CoinConverter coinConverter){
        this.productList = productList;
        this.coinConverter = coinConverter;
    }

    public void showPurchase(){
        productList.forEach(l -> {double coinConverted = coinConverter.convertCoin(l.getPrice());
           System.out.println("Product name:" + l.getName() + "Price: " + coinConverted);});
    }
}
