public class Vehicle {
    private String vehicleNumber;
    private String manufacturer;
    private String model;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String manufacturer, String model, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.manufacturer = manufacturer;
        this.model = model;
        this.rentalRate = rentalRate;
    }

    // Getters and setters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    // Calculate rental cost for specified number of days
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    // Override toString() to provide a string representation of the vehicle
    @Override
    public String toString() {
        return "Vehicle Number: " + vehicleNumber +
               ", Manufacturer: " + manufacturer +
               ", Model: " + model +
               ", Rental Rate per day: RM" + rentalRate;
    }
}
