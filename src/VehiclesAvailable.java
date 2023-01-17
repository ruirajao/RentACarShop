public enum VehiclesAvailable {
    CAR001("Renault", "Megane", "Azul", 3),
    CAR002("Renault", "Clio", "Azul", 2),
    CAR003("Ford", "Fiesta", "Rosa", 1),
    CAR004("Mercedes", "Class A", "Azul", 3),
    MOT005("BMW", "TopBike", "Cinzenta", 4),
    MOT006("Yamaha", "Famel", "Amarela", 7);

    private final String brand;
    private final String model;
    private final String color;
    private final int consumption;
    private boolean isAvailable;

    private VehiclesAvailable(String brand, String model, String color, int consumption) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.consumption = consumption;
        this.isAvailable = true;
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}