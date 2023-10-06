package seminar1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<BottleofWater> listProduct = new ArrayList<>();
        listProduct.add(new BottleofWater("OOPsem", 7, 2));
        listProduct.add(new BottleofWater("OOPlec", 7, 1));
        listProduct.add(new BottleofWater("DZ", 5, 1));
        listProduct.add(new BottleofWater("Java", 20, 100));
        listProduct.add(new BottleofWater("Test", 11, 5));

        List<HotDrink> hotDrink = new ArrayList<>();
        hotDrink.add(new HotDrink("Cofe", 5, 65, 2));
        hotDrink.add(new HotDrink("Tea", 3, 60, 2));

        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine(listProduct);
        System.out.println(vendingMachine.getProduct("OOPsem"));
        System.out.println(vendingMachine.getProduct("OOPlec"));

        HotDrinkVendingMachine vendingMachine2 = new HotDrinkVendingMachine(hotDrink);
        System.out.println(vendingMachine2.getProduct("Cofe"));
        System.out.println(vendingMachine2.getProduct("Tea"));
    }
    
}
