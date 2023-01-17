public class Shop {

    private String shopName;

    public VehiclesAvailable vehicle;

    public Client client;

    public Shop(String shopName) {
        this.shopName = shopName;
    }

    public void showAvailableVehicles() {
        for (VehiclesAvailable vehicle : VehiclesAvailable.values()) {
            if (vehicle.isAvailable() == true) {
                System.out.println(vehicle + ": " + vehicle.getBrand() + " " + vehicle.getModel() + " " + vehicle.getColor());
            }
        }
    }

    public void giveVehicle(VehiclesAvailable vehicle) {
        if (client.getAge() < 18) {
            System.out.println("Sorry, you're not old enough!");
            return;
        }
        if (client.hasDrivingLicense() == false) {
            System.out.println("Sorry, you need a driving license to rent a vehicle");
            return;
        }
        vehicle.setAvailable(false);
        System.out.println("You've rented the " + vehicle.getBrand() + " " + vehicle.getModel());
    }
}