public class Chair extends Product{
    private double price;
    @Override
    public void setPrice(double price) {
        this.price=price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Functionality visitorObj) {
        visitorObj.visit(this);
    }
}
