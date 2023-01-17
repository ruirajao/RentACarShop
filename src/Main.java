public class Main {
    public static void main(String[] args) {
        Shop teLogoohZe = new Shop("TéLogoOhZé");

        Client carla = new Client("Carla", 30, true);

        carla.enterShop(teLogoohZe);

        carla.rentVehicle(teLogoohZe, VehiclesAvailable.CAR001);
        // shop.rentVehicle(Client, CAR001)
    }
}