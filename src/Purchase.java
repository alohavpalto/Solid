class Purchase {

  protected String productName;
  protected int productCount;

  public Purchase(String productName, int productCount) {
    this.productName = productName;
    this.productCount = productCount;
  }

  public String getProductName() {
    return productName;
  }

  public int getProductCount() {
    return productCount;
  }

  public void increaseCount(int count) {
    this.productCount += count;
  }
}