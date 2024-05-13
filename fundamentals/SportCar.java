public class SportCar extends Vehicle {
    public SportCar(Motor motor) {
        super(motor);
    }

    @Override
    public void move() {
        System.out.println("SportCar is moving");
    }
}
