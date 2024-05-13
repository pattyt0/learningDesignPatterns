public class Truck implements VehicleInterface {

    private Motor motor;

    public Truck() {
        motor = new Motor("Generic", 1000);
    }

    @Override
    public void move() {
        System.out.printf("Truck (%s) is moving.\n", this.motor);
    }

    @Override
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
