import java.util.HashMap;
import java.util.Map;


class Basket {

  private HashMap<String, Purchase> purchases = new HashMap<>();

  public void addProduct(String title, int count) {
    if (purchases.containsKey(title)) {
      Purchase purchase = purchases.get(title);
      purchase.increaseCount(count);
    } else {
      Purchase purchase = new Purchase(title, count);
      purchases.put(title, purchase);
    }
  }

  public long calculateTotalSum(Map<String, Integer> prices) {
    long sum = 0;
    System.out.println("КОРЗИНА:");
    for (Map.Entry<String, Purchase> entry : purchases.entrySet()) {
      String productName = entry.getKey();
      Purchase purchase = entry.getValue();
      int productCount = purchase.getProductCount();
      int productPrice = prices.get(productName);
      System.out.println(
          "\t" + productName + " " + productCount + " шт. в сумме " + (productCount * productPrice)
              + " руб.");
      sum += productCount * productPrice;
    }
    return sum;
  }
}