package workintech.s14d3.model.carskeleton;
import workintech.s14d3.model.carskeleton.*;
public class Main {
    public static void main(String[] args) {
        CarSkeleton gasCar = new GasPoweredCar("Gas Car", "A gas-powered car", 15.0, 4);
        CarSkeleton electricCar = new ElectricCar("Electric Car", "An electric car", 150.0, 500);
        CarSkeleton hybridCar = new HybridCar("Hybrid Car", "A hybrid car", 20.0, 200, 4);

        CarSkeleton[] cars = { gasCar, electricCar, hybridCar };

        for (CarSkeleton car : cars) {
            car.startEngine();
            car.drive();
            System.out.println("Car type: " + car.getClass().getSimpleName());
            System.out.println("***********");
        } }
}
