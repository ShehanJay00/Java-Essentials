package FoodDelivery;

public class BikeDelivery extends DeliveryPerson{
    public BikeDelivery(String name) {
        super(name);
    }

    @Override
    public void deliver(String address) {
        System.out.println(name + " is delivering order by bike to " + address);
    }

}
