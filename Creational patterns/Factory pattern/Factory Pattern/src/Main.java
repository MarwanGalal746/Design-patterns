import Clothes.ShirtsFactory;
import Clothes.ShoesFactory;

public class Main {
    public static Broker broker = new Broker();

    public static void main(String[] args) {
        firstBranch();
        secondBranch();
    }

    public static void firstBranch() {
        ShirtsFactory shirt = (ShirtsFactory) broker.exportClothes("shirts");
        ShoesFactory shoesFactory = (ShoesFactory) broker.exportClothes("shoes");
        System.out.println("First branch: " + shirt);
        System.out.println("First branch: " + shoesFactory);
    }

    public static void secondBranch() {
        ShirtsFactory shirt = (ShirtsFactory) broker.exportClothes("shirts");
        ShoesFactory shoesFactory = (ShoesFactory) broker.exportClothes("shoes");
        System.out.println("Second branch: " + shirt);
        System.out.println("Second branch: " + shoesFactory);
    }
}