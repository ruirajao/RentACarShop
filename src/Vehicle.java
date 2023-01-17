public abstract class Vehicle {
    private String brand;
    private String color;
    private int tank;
    private int tankConsumption; // Km/lt

    public Vehicle(String brand, String color, int tankConsumption) {
        this.brand = brand;
        this.color = color;
        this.tank = 25;
        this.tankConsumption = tankConsumption;
    }

    public int currentFuel() {
        return tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }

    public int getTankConsumption() {
        return tankConsumption;
    }

    public void refill() {
        this.tank = 25;
    }

    public abstract void drive(int distance, int time);
}