public class Main {
    public static void main(String[] args) {
 
        Chef chef = new Chef();
        Waiter waiter = new Waiter();
 
        Restaurant restaurant = new Restaurant(chef, waiter);
 
        restaurant.handleOrder("Masala Dosa");
    }
}