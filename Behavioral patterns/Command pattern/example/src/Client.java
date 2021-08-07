public class Client {

    public static void main(String[] args) {
        Chef c = new Chef();
        Meal m = new firstMeal(c);
	    Waiter w = new Waiter(m);
	    w.execute();
    }
}
