public class Car extends Vehicle {
    private final int maxSpeed;

    public Car(String brand, String color, int tankConsumption, int maxTank) {
        super(brand, color, tankConsumption, maxTank);
        this.maxSpeed = 120;
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
        } else System.out.println("DAAAAAA-lHEEEEEEEEEEE ZEEEEEEEEEE!");
        setTank(getTank() - (((getTankConsumption()) * distance) / 100));
    }
}