public class Client {

    private String clientName;
    private int age;
    private boolean hasDrivingLicense;
    private int fuelPenalty;
    public Shop shop;

    public Client(String clientName, int age, boolean hasDrivingLicense) {
        this.clientName = clientName;
        this.age = age;
        this.hasDrivingLicense = hasDrivingLicense;
        this.fuelPenalty = 0;
    }

    public int getAge() {
        return age;
    }

    public String getClientName() {
        return clientName;
    }

    public boolean hasDrivingLicense() {
        return hasDrivingLicense;
    }

    public void enterShop(Shop shop) {
        System.out.println("Welcome to our shop! Here's the list of available vehicles:");
        shop.showAvailableVehicles();
    }

    public void rentVehicle(Shop shop, VehiclesAvailable vehicle) {
        if(fuelPenalty > 2) {
            System.out.println("Sorry, you can't rent another car");
            return;
        }
        shop.giveVehicle(vehicle);
    }
    public void returnVehicle(){
    }
}
