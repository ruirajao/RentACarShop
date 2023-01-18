public abstract class Vehicle {
    private final String brand;
    private final String color;
    private int tank;
    private final int maxTank;
    private final int tankConsumption; // L/100km

    public Vehicle(String brand, String color, int tankConsumption, int maxTank) {
        this.brand = brand;
        this.color = color;
        this.tank = 25;
        this.tankConsumption = tankConsumption;
        this.maxTank = maxTank;
    }

    public int getTank() {
        return this.tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }

    public int getTankConsumption() {
        return tankConsumption;
    }


    public void refill() {
        this.tank = maxTank;
    }

    public abstract void drive(int distance, int time);
}