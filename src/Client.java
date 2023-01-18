public class Client {

    private final String clientName;
    private int age;
    private boolean hasDrivingLicense;
    public boolean hasEnteredShop = false;
    private Vehicle vehicle;

    public Client(String clientName, int age, boolean hasDrivingLicense) {
        this.clientName = clientName;
        this.age = age;
        this.hasDrivingLicense = hasDrivingLicense;
    }

    public int getAge() {
        return age;
    }

    public boolean hasDrivingLicense() {
        return hasDrivingLicense;
    }

    public void enterShop(Shop shop) {
        if (!hasEnteredShop) {
            System.out.println("Welcome to our shop! Here's the list of available vehicles:");
            shop.showAvailableVehicles();
            hasEnteredShop = true;
            return;
        }
        System.out.println("You've already entered in a shop.");
    }

    public void trip(int distance, int time) {
        if (this.vehicle == null) {
            System.out.println("You haven't rented a vehicle");
            return;
        }
        if (!hasEnteredShop) {
            System.out.println("You haven't entered in a shop");
            return;
        }
        if (vehicle instanceof Car) {
            ((Car) vehicle).drive(distance, time);
            return;
        }
        if (distance > 80) {
            System.out.println("My Motorcycle can't drive that distance.");
            return;
        }
        ((Motorcycle) vehicle).drive(distance, time);
    }

    public void receiveMoto(VehiclesAvailable vehicle) {
        this.vehicle = new Motorcycle(vehicle.getBrand(), vehicle.getColor(), vehicle.getConsumption(), vehicle.getMaxTank());
        vehicle.setAvailable(false);
    }

    public void receiveCar(VehiclesAvailable vehicle) {
        this.vehicle = new Car(vehicle.getBrand(), vehicle.getColor(), vehicle.getConsumption(), vehicle.getMaxTank());
        vehicle.setAvailable(false);
    }

    public void refuelVehicle() {
        vehicle.refill();
    }

    public void returnVehicle(Shop shop, VehiclesAvailable vehicle) {
        if (vehicle.isAvailable()) {
            System.out.println("You didn't rent this vehicle.");
            return;
        }
        vehicle.setAvailable(true);
        shop.calculatePayment(this.vehicle.getTank(), vehicle);
        System.out.println(vehicle.getBrand() + " " + vehicle.getModel() + " " + vehicle.getColor() + " returned.");
    }
}