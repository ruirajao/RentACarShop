public class Car extends Vehicle {
    private int maxSpeed;

    public Car(String brand, String color, int tankConsumption) {
        super(brand, color, tankConsumption);
        this.maxSpeed = 120;
    }

    @Override
    public void drive(int distance, int time) {
        if ((distance / time) > 120) {
            System.out.println("You can't go that fast");
            return;
        }
        if ((distance/getTankConsumption()) < currentFuel()) {
            System.out.println("You don't have enough fuel");
            return;
        }
        else System.out.println("Vruuuuuuuuum");
        setTank(currentFuel()-(getTankConsumption()*distance));
    }
}