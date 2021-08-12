public class Client {

    public static void main(String[] args) {
        Product chair = new Chair();
        chair.setPrice(50);
        Functionality addTax = new AddTax();
        chair.accept(addTax);
        System.out.println(chair.getPrice());
    }
}
