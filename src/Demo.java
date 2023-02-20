public class Demo {
  /**
   * @param argv
   */
  public static void main(String argv[]) {
    DiscountStrategy strategy = null;
    Order order = new Order("Peter", 400.0f);

    

    // discount strategy
    // int selectedStrat = Integer.parseInt(argv[0]);

    // discount amount
    float amt = Float.parseFloat(argv[1]);

    final int selectedStrat = 0;
    switch(selectedStrat) {
    case 1:
      strategy = new PercentDiscountStrategy(amt);
      break;
    case 2:
      strategy = new StoreCreditDiscountStrategy(amt);
      break;
    case 3:
      strategy = new RandomDiscountStrategy();
      break;
    default:
      throw new RuntimeException("Unknown type: " + selectedStrat);
    }

    System.out.println("Hello " + order.getName());
    System.out.println("The full price of your order was " + order.getPrice());
    System.out.println("Your discount price is " + strategy.applyDiscount(order));
    System.out.println("We are testing");
  }
}
