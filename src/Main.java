public class Main {
    public static void main(String[] args) {
        Shop teLogoohZe = new Shop("TéLogoOhZé");

        Client carla = new Client("Carla", 30, true);

        Client paulo = new Client("Paulo", 19, true);

        carla.enterShop(teLogoohZe);

        teLogoohZe.rentVehicle(carla, VehiclesAvailable.CAR001);

        carla.trip(120,1);
        carla.trip(120,1);
        carla.trip(120,1);
        carla.trip(120,1);
        carla.trip(120,1);

        carla.refuelVehicle();

        carla.trip(120,1);
        carla.trip(120,1);
        carla.trip(120,1);

        carla.returnVehicle(teLogoohZe, VehiclesAvailable.CAR001);
        System.out.println("-------------------------------------".repeat(10));
        paulo.trip(120,1);
    }
}