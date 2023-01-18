public class Shop {

    private final String shopName;
    private int carCounter;
    private int motorcycleCounter;

    public Shop(String shopName) {
        this.shopName = shopName;
        this.carCounter = 0;
        this.motorcycleCounter = 0;
    }

    public void showAvailableVehicles() {
        for (VehiclesAvailable vehicle : VehiclesAvailable.values()) {
            if (vehicle.isAvailable()) {
                System.out.println(vehicle + ": " + vehicle.getBrand() + " " + vehicle.getModel() + " " + vehicle.getColor());
            }
        }
    }

    public void rentVehicle(Client client, VehiclesAvailable vehicle) {
        if (!client.hasEnteredShop) {
            System.out.println("You need to enter the shop before renting a vehicle.");
            return;
        }
        if (!client.hasDrivingLicense()) {
            System.out.println("Sorry, you need a driving license to rent a vehicle.");
            return;
        }
        if (!vehicle.isCar()) {
            if (client.getAge() < 16) {
                System.out.println("You need to be old enough to rent a Motorcycle.");
                return;
            }
            vehicle.setAvailable(false);
            System.out.println("You've rented the " + vehicle.getBrand() + " " + vehicle.getModel());
            client.receiveMoto(vehicle);
            motorcycleCounter++;
            return;
        }
        if (client.getAge() < 18) {
            System.out.println("You need to be old enough to rent a Car.");
            return;
        }
        vehicle.setAvailable(false);
        System.out.println("You've rented the " + vehicle.getBrand() + " " + vehicle.getModel());
        client.receiveCar(vehicle);
        carCounter++;
    }

    public void calculatePayment(int tank, VehiclesAvailable vehicle) {
        if (tank < 20) {
            double extraPayment;
            extraPayment = ((20 - tank) * 2.5);
            System.out.println("You will have to pay an extra " + extraPayment + "€ for the missing fuel.");
            double total = extraPayment + vehicle.getRentCost();
            System.out.println("In total, you'll have to pay " + total + "€ for the vehicle rent.");
            return;
        }
        System.out.println("In total, you'll have to pay " + vehicle.getRentCost() + "€ for the vehicle rent.");
    }

    public void getVehicleCounter() {
        System.out.println("This shop has rented " + motorcycleCounter + " motorcycles, and " + carCounter + " cars.");
    }
}