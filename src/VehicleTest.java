public class VehicleTest {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Bike bike = new Bike();

        truck.stop();
        truck.jazda(2000);
        System.out.println(truck.info());
    }
}
