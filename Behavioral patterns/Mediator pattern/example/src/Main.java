public class Main {

    public static void main(String[] args) {
        Group g = new chatGroup();
        user ahmed = new adminUser(g, "ahmed");
        user fady = new regularUser(g, "fady");
        user amr = new regularUser(g, "amr");
        g.addUser(ahmed); g.addUser(fady) ;g.addUser(amr);
        fady.send("Hello, I am fady.");
        System.out.println("-----------------");
        ahmed.send("Hello, I am Ahmed");
    }
}
