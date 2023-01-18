public class Motorcycle extends Vehicle {
    private final int maxSpeed;

    public Motorcycle(String brand, String color, int tankConsumption, int maxTank) {
        super(brand, color, tankConsumption, maxTank);
        this.maxSpeed = 100;
    }

    @Override
    public void drive(int distance, int time) {
        if ((distance / time) > maxSpeed) {
            System.out.println("You can't go that fast.");
            return;
        }
        if ((getTank() - (distance * getTankConsumption() / 100)) < 0 || getTank() <= 0) {
            System.out.println("You don't have enough fuel.");
            return;
        } else System.out.println("DA-LHEEEEEEE ZEEEEE!");
        setTank(getTank() - (((getTankConsumption()) * distance) / 100));
    }
}