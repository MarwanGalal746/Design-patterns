public class Waiter {
    private Meal clientMeal;

    public Waiter(Meal clientMeal) {
        this.clientMeal = clientMeal;
    }

    public void execute(){
        System.out.println("I am the waiter, I will deliver your order to our chef");
        clientMeal.order();
    }
}
