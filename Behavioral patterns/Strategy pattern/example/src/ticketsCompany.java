public class ticketsCompany {
    private paymentStrategies ourStrategy;

    public ticketsCompany(paymentStrategies ourStrategy) {
        this.ourStrategy = ourStrategy;
    }

    public void pay(){
        ourStrategy.pay();
    }
}
