/**
 * Created by Ромашка on 12.08.2017.
 */
public class Main {

    public static void main(String[] args) {
        final Passanger passanger = new Passanger();
        passanger.loadCar();

        Car car = new Car();
        car.startEngine();
        car.stopEngine();

        final Passanger passangerWithLagguage = new Lagguage();
        passangerWithLagguage.loadCar();

        Car carWithLagguage = new Car();
        carWithLagguage.stopEngine();
        carWithLagguage.stopEngine();
    }
}
