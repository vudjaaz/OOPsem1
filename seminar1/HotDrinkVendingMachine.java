package seminar1;

import java.util.*;

public class HotDrinkVendingMachine implements VendingMachine {
    List<HotDrink> hotDrinkList;

    public HotDrinkVendingMachine(List<HotDrink> hotDrinkList) {
        this.hotDrinkList = hotDrinkList;
    }

    public List<HotDrink> getHotDrinkList() {
        return hotDrinkList;
    }

    public void setHotDrinkList(List<HotDrink> hotDrinkList) {
        this.hotDrinkList = hotDrinkList;
    }

    public void addHotDrink(HotDrink HotDrink) {
        this.hotDrinkList.add(HotDrink);
    }


    @Override
    public Product getProduct(String name) {
        for(HotDrink hotDrink : hotDrinkList) {
            if(hotDrink.getName().equals(name)) {
                return hotDrink;
            }
        }
        return null;

    }

    public HotDrink getProduct(String name, int volume) {
        for (HotDrink hotDrink : hotDrinkList) {
            if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume ) {
                return hotDrink;
            }
        }
        return null;

    }


}
