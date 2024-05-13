public class Car extends Vehicle {
    public Car(Motor motor) {
        super(motor);
    }

    @Override
    public void move() {
        System.out.println("Moving car faster");
    }
}
