package assignment18;

public class Q5 {
    public class Book{
        String title;
        String author;
        int price;
        boolean availability;

        Book(String title, String author, int price, boolean availability){
            this.title = title;
            this.author = author;
            this.price = price;
            this.availability = availability;
        }

        public void checkAvailability() {
            this.availability = availability;
            if(availability==true){
                System.out.println("Book is available");
            }
            else{
                System.out.println("Book is not available");
            }
        }
        public void displayDetails(){
            System.out.println("Book Name : " + title);
            System.out.println("Author Name : " + author);
            System.out.println("Book Price : " + price);
            System.out.println("Book Availability : " + availability);
        }
    }
    public static void main(String[] args){
        Q5 q5 = new Q5();
        Book book1 = q5.new Book("HP", "JK", 495, true);
        Book book2 = q5.new Book("2 states", "CB", 399, false);

        book1.checkAvailability();
        book2.checkAvailability();
    }
}
