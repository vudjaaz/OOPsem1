package seminar1;

public abstract class Product {

    private String name;
    private double price;
    private int temperature;
    
    public Product(String name, double price, int temperature) {
        this.name = name;
        this.price = price;
        this.temperature = temperature;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", temperature=" + temperature + "]";
    }
}
