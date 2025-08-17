package FoodDelivery;

public abstract class DeliveryPerson {
    String name;
    public DeliveryPerson(String name) {
        this.name = name;
    }

    public abstract void deliver(String address);

    public void sayHello() {
        System.out.println("Hello! I am " + name + ", your delivery person.");
    }

}
