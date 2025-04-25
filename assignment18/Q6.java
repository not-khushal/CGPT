package assignment18;
public class Q6 {
class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double ratePerDay = 500.0; // Default rate per day

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * ratePerDay;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }
}


    public static void main(String[] args) {
        Q6 q6 = new Q6();
        CarRental rental = q6.new CarRental("John Doe", "Toyota Camry", 6);
        System.out.println("Total cost: $" + rental.calculateTotalCost());
    }
}