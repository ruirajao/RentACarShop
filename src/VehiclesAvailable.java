public enum VehiclesAvailable {
    CAR001(true, "Renault", "Megane", "Azul", 5, 60, 100),
    CAR002(true, "Renault", "Clio", "Azul", 2, 50, 80),
    CAR003(true, "Ford", "Fiesta", "Rosa", 1, 45, 60),
    CAR004(true, "Mercedes", "Class A", "Azul", 3, 65, 150),
    MOT005(false, "BMW", "TopBike", "Cinzento", 4, 35, 3000),
    MOT006(false, "Yamaha", "Famel", "Amarelo", 7, 30, 5);

    private final boolean isCar;
    private final String brand;
    private final String model;
    private final String color;
    private final int consumption;
    private boolean isAvailable;
    private final int maxTank;
    private double tank;
    private final int rentCost;

    private VehiclesAvailable(boolean isCar, String brand, String model, String color, int consumption, int maxTank, int rentCost) {
        this.isCar = isCar;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.consumption = consumption;
        this.isAvailable = true;
        this.maxTank = maxTank;
        this.rentCost = rentCost;
        this.tank = 25;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getConsumption() {
        return consumption;
    }

    public int getMaxTank() {
        return maxTank;
    }

    public boolean isCar() {
        return isCar;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getRentCost() {
        return rentCost;
    }
}