public class Demo {
  public static void main(String argv[]) {
    DiscountStrategy strategy = null;
    Order order = new Order("Peter", 400.0f);

    


    //int selectedStrat = Integer.parseInt(argv[0]);
    float amt = Float.parseFloat(argv[1]);

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
