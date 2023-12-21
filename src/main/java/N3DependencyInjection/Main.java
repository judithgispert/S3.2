package N3DependencyInjection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main (String[]args){

       List<Product>productList = List.of(new Product("Jeans", 23.10),
               new Product("Jumper", 19.99), new Product("Jacket", 49.39));

       System.out.println("Price in Euros: \r\n" + productList);

       System.out.println("Price in Dollars:");
       Shop shop = new Shop(productList, new DollarConverter());
       shop.showPurchase();

       System.out.println("Price in Yens:");
       Shop shop1 = new Shop(productList, new YenConverter());
       shop1.showPurchase();

       System.out.println("Price in Francs:");
       Shop shop2 = new Shop(productList, new FrancConverter());
       shop2.showPurchase();

    }
}
