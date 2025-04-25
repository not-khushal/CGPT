package assignment18;

public class Q4 {
    public class HotelBooking{
        String name;
        String location;
        int price;

        HotelBooking(){
            name = "Oyo";
            location = "Delhi";
            price = 899;
        }
        HotelBooking(String name, String location, int price){
            this.name = name;
            this.location = location;
            this.price = price;
        }
        HotelBooking(HotelBooking prevDetails){
            this.name = prevDetails.name;
            this.location = prevDetails.location;
            this.price = prevDetails.price;
        }
        public void displayDetails(){
            System.out.println("Name of Hotel : " + name);
            System.out.println("Location of Hotel : " + location);
            System.out.println("Price of Hotel : " + price);
        }
    }
    public static void main(String[] args){
        Q4 q4 = new Q4();
        HotelBooking h1 = q4.new HotelBooking();
        System.out.println("Hotel 1 Details(default) : ");
        h1.displayDetails();
        HotelBooking h2 = q4.new HotelBooking("Radisson", "Chennai", 5999);
        System.out.println("Hotel 2 Details(parameter) : ");
        h2.displayDetails();
        HotelBooking h3 = q4.new HotelBooking(h2);
        System.out.println("Hotel 3 Details(copy constructor) : ");
        h3.displayDetails();
    }
}
