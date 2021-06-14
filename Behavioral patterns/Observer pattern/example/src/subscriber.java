public class subscriber extends Observer{
    String name;

    public subscriber(String name) {
        this.name = name;
    }

    @Override
    public void getNotified() {
        System.out.println(name + " has been notified that a video was uploaded.");
    }
}
