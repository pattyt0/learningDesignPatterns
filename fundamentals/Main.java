/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new CommonCar(new Toyota90("Toyota", 100));
        System.out.printf("Vehicle developed in 90's %s \n", vehicle);
        System.out.println("Vehicle motor discontinued");

        vehicle = new CommonCar(new Toyota2024("Toyota", 150));
        vehicle.move();
        System.out.printf("Vehicle developed in 2024's %s \n", vehicle);

        // Vehicle holds a reference to the Car instance and its move method
        vehicle = new SportCar(new Toyota2024("toyota", 200));
        vehicle.move();
    }
}
