package foodbasket;

import java.util.ArrayList;
import java.util.List;

public class FoodBasket {

    private final List<String> basket;

    public FoodBasket() {
        basket = new ArrayList<String>();
    }

    public void getAllProducts() {
        for (String product: this.basket) {
            System.out.println(product);
        }
    }

    public void addProduct(String prodName) {
        this.basket.add(prodName);
    }
}
