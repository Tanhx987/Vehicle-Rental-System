public class Motorcycle extends Vehicle {
    private double engineCapacity;

    public Motorcycle(String vehicleNumber, String manufacturer, String model, double rentalRate, double engineCapacity) {
        super(vehicleNumber, manufacturer, model, rentalRate);
        this.engineCapacity = engineCapacity;
    }

    // Getters and setters
    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    // Calculate top speed based on engine capacity
    public double calculateTopSpeed() {
        return engineCapacity * 0.5;
    }

    // Override toString() to include Motorcycle-specific attributes
    @Override
    public String toString() {
        return super.toString() + ", Engine Capacity: " + engineCapacity + "cc";
    }

    // Override calculateRentalCost() to add RM150 for motorcycles with a top speed of at least 300
    @Override
    public double calculateRentalCost(int days) {
        if (calculateTopSpeed() >= 300) {
            return super.calculateRentalCost(days) + 150 * days;
        } else {
            return super.calculateRentalCost(days);
        }
    }
}
