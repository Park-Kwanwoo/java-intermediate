package map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    Map<Product, Integer> productMap = new HashMap<>();

    public void add(Product product, int quantity) {
        productMap.put(product, productMap.getOrDefault(product, 0) + quantity);
    }

    public void printAll() {
        System.out.println("== 모든 상품 출력 ==");
        for (Product product : productMap.keySet()) {
            System.out.println(product + " 수량: " + productMap.get(product));
        }
    }

    public void minus(Product product, int quantity) {
        Integer currentQuantity = productMap.get(product);
        currentQuantity -= quantity;
        if (currentQuantity <= 0) {
            productMap.remove(product);
        }
    }
}
