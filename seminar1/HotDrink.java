package seminar1;

public class HotDrink extends Product {
    private int volume;
    private int temperature;

    public HotDrink(String name, double price, int temperature, int volume) {
        super(name, price, temperature);
        this.volume = volume;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink [" +
                              "name = " + super.getName() + '\\' +
                              "price = " + super.getPrice() + '\\' +
                              "temperature" + super.getTemperature() + '\\' +
                              "volume = " + volume + "]";
    }

    
    
}
