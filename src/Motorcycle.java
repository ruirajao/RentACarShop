public class Motorcycle extends Vehicle {
    private int maxSpeed;

    public Motorcycle(String brand, String color, int tankConsumption) {
        super(brand, color, tankConsumption);
        this.maxSpeed = 100;
    }

    @Override
    public void drive(int distance, int time) {
        if ((distance / time) > 100) {
            System.out.println("You can't go that fast");
            return;
        }
        if ((distance/getTankConsumption()) < currentFuel() || distance > 80) {
            System.out.println("You don't have enough fuel");
            return;
        }
        else System.out.println("Vruuuuuuuuum");
        setTank(currentFuel()-(getTankConsumption()*distance));
    }
}