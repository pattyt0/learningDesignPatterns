/**
 * Inheritance - Assuming vehicle's engine has been discontinued we must replace it with something
 * similar. The new replacement will be a child in ca class hierarchy
 */
public class Motor {
    private String brand;
    private int power;

    public Motor(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public int getPower() {
        return power;
    }

    public void start() {
        System.out.println("Motor is starting...");
    }

    public void stop() {
        System.out.println("Motor is stopping...");
    }

    @Override
    public String toString() {
        return "Motor{" +
            "brand='" + brand + '\'' +
            ", power=" + power +
            '}';
    }
}
