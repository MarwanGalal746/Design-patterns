import Clothes.ShirtsFactory;
import Clothes.ShoesFactory;

import java.util.HashMap;
import java.util.Map;

public class Broker {
    private final Map<String, Clothes.Factory> productsMap = new HashMap<String, Clothes.Factory>() {{
        put("shirts", new ShirtsFactory());
        put("shoes", new ShoesFactory());
    }};

    public Clothes.Factory exportClothes(String productName) {
        return productsMap.get(productName);
    }
}
