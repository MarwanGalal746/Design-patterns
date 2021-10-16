public class Main {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new BikeAdapter();
        car.accelerate();
        bike.accelerate();
    }
}
