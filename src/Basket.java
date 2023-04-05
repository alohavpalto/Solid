import java.util.Map;

class Basket {

  protected Purchase[] purchases = new Purchase[4];

  public void addProduct(String title, int count) {
    for (int i = 0; i < purchases.length; i++) {
      if (purchases[i] == null) {
        purchases[i] = new Purchase(title, count);
        return;
      }
      if (purchases[i].getProductName().equals(title)) {
        purchases[i].increaseCount(count);
        return;
      }
    }
  }

  public long calculateTotalSum(Map<String, Integer> prices) {
    long sum = 0;
    System.out.println("КОРЗИНА:");
    for (int i = 0; i < purchases.length; i++) {
      Purchase purchase = purchases[i];
      if (purchase == null) {
        continue;
      }
      String productName = purchase.getProductName();
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