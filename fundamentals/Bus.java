public class Bus implements VehicleInterface {
    private Motor motor;

    public Bus() {
        motor = new Motor("Generic", 1000);
    }

    @Override
    public void move() {
        System.out.printf("Bus (%s) is moving.\n", this.motor);
    }

    @Override
    public void setMotor(Motor motor) {
        this.motor = motor;    }
}
