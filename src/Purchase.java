class Purchase {

  private int productCount;

  public Purchase(String productName, int productCount) {
    this.productCount = productCount;
  }

  public int getProductCount() {
    return productCount;
  }

  public void increaseCount(int count) {
    this.productCount += count;
  }
}