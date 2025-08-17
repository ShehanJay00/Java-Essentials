package FoodDelivery;

public class Restaurant {
    public void prepareOrder(){
        System.out.println("Preparing a generic order...");
    }
}

class PizzaRestaurant extends Restaurant {
    public void prepareOrder(){
        System.out.println("Preparing a delicious pizza...");
    }
}

class SushiRestaurant extends Restaurant {
    public void prepareOrder(){
        System.out.println("Preparing a sushi...");
    }
}
