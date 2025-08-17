package FoodDelivery;

public class Order {
    private static int orderCount = 0;  // shared by all orders
    private int orderId;
    private Customer customer;
    private double amount;

    public Order(Customer customer, double amount) {
        this.customer = customer;
        this.amount = amount;
        orderId = ++orderCount; // auto-increment order ID
    }

    public int getOrderId() { return orderId; }
    public double getAmount() { return amount; }
}
