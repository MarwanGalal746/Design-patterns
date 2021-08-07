
public class firstMeal extends Meal {
    private Chef rec;

    @Override
    public void order() {
        System.out.println("Your order in his way to the chef.");
        rec.cookingOrder();
    }
}
