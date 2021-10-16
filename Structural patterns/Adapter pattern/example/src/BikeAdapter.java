public class BikeAdapter extends Vehicle{
    private Bike bike;

    public BikeAdapter() {
        this.bike = new Bike();
    }

    @Override
    public void accelerate() {
        bike.bedal();
    }
}
