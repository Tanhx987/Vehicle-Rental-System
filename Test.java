public class Test {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        
        vehicles[0] = new Car("JKL1001", "Toyota", "Camry", 100, 4);
        vehicles[1] = new Car("JMM1111", "Honda", "Civic", 90, 2);
        vehicles[2] = new Motorcycle("JJJ1234", "Yamaha", "YZF-R6", 50, 250);
        vehicles[3] = new Motorcycle("JUY2233", "Kawasaki", "Ninja 300", 40, 200);

        int rentalDays = 5;
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
            System.out.println("Rental Cost for " + rentalDays + " days: RM" + vehicle.calculateRentalCost(rentalDays));
            
            if (vehicle instanceof Motorcycle) {
                System.out.println("Top Speed: " + ((Motorcycle) vehicle).calculateTopSpeed() + " km/h");
            }
            
            System.out.println();
        }
    }
}

