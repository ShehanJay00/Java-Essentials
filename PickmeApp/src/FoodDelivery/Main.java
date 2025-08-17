package FoodDelivery;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
            Customer c1 = new Customer("shehan" , "Colombo");
            Customer c2 = new Customer("Malinda", "Gampaha");

            Restaurant r1 = new PizzaRestaurant();
            Restaurant r2 = new SushiRestaurant();

            r1.prepareOrder();
            r2.prepareOrder();

            Order o1 = new Order(c1, 1200.50);
            Order o2 = new Order(c2, 800.00);

            List<Order> orders = new ArrayList<>();
            orders.add(o1);
            orders.add(o2);

            Payment payment1 = new CardPayment();
            payment1.pay(o1.getAmount());

            Payment payment2 = new CashPayment();
            payment2.pay(o2.getAmount());

            DeliveryPerson dp = new BikeDelivery("Kamal");
            dp.sayHello();
            dp.deliver(c1.getAddress());

            for (Order o : orders) {
                System.out.println("Order ID: " + o.getOrderId() + " Amount: " + o.getAmount());
            }
        }
        catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
