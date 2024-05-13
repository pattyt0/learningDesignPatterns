public class CommonCar extends Vehicle {
    public CommonCar(Motor motor) {
        super(motor);
    }

    @Override
    public void move() {
        System.out.println("Common car is moving faster");
    }
}
