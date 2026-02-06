class Restaurant {
 
    private Chef chef;

    private Waiter waiter;
 
    // Constructor

    public Restaurant(Chef chef, Waiter waiter) {

        this.chef = chef;

        this.waiter = waiter;

    }
 
    public void handleOrder(String dish) {
 
        waiter.takeOrder(dish);

        chef.prepareIngredients(dish);

        chef.cook(dish);

        waiter.serveFood(dish);
 
        System.out.println("Customer is satisfied 😊\n");

    }

}

 