package assignment17;

public class Q9 {
    public class MovieTicket{
        private String movieName;
        private int seatNumber;
        private int price;

        public MovieTicket(String movieName, int seatNumber, int price){
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
        }
        public int ticketPrice(int quantity){
            price = price*quantity;
            return price;
        }
        public void displayDetails(){
            System.out.println("Name of Movie " + movieName);
            System.out.println("Seat Number " + seatNumber);
            System.out.println("Price of Movie " + price);
        }
    }
    public static void main(String[] args) {
        Q9 q9 = new Q9();
        MovieTicket tic1 = q9.new MovieTicket("DDLJ", 012, 350);
        MovieTicket tic2 = q9.new MovieTicket("Barfi", 013, 450);

        tic1.displayDetails();
        tic2.displayDetails();
    }
}
