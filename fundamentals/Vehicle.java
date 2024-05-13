/**
 * {@link Vehicle} hides internal state
 * In the imaginary vehicle we expose only what serves, and not how the engine works
 */
public class Vehicle {
    private boolean moving;
    private Motor motor;
    private int speed;
    private boolean accelerate;

    public Vehicle(Motor motor) {
        this.motor = motor;
    }

    public void move() {
        this.moving = true;
        System.out.printf("Moving vehicle %b", this.moving);
    }

    /**
     * Polymorphism - overloading
     * Changing method argument type
     */
    public void move(int speed) {
        this.speed = speed;
    }

    /**
     * Polymorphism - overloading
     * Changing method argument type
     */
    public void move(double speed) {
        this.speed = (int) speed;
    }

    /**
     * Polymorphism - overloading
     * Changing number of method arguments
     */
    public void move(int speed, boolean accelerate) {
        this.speed = speed;
        this.accelerate = accelerate;
    }

    public void stop() {
        this.moving = false;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
            "moving=" + moving +
            ", motor=" + motor +
            '}';
    }
}