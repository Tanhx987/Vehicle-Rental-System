public class Car extends Vehicle {
    private int numDoors;

    public Car(String vehicleNumber, String manufacturer, String model, double rentalRate, int numDoors) {
        super(vehicleNumber, manufacturer, model, rentalRate);
        this.numDoors = numDoors;
    }

    // Getters and setters
    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    
    @Override
    public String toString() {
        return super.toString() + ", Number of Doors: " + numDoors;
    }


    @Override
    public double calculateRentalCost(int days) {
        if (numDoors > 2) {
            return super.calculateRentalCost(days) + 35 * days;
        } else {
            return super.calculateRentalCost(days);
        }
    }
}
