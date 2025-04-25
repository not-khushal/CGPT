package assignment18;

public class Q1 {
    public class Book{
        String title;
        String author;
        int price;

        Book(){
            title = "Book Title";
            author = "anonymous";
            price = 449;
        }
        Book(String title, String author, int price){
            this.title = title;
            this.author = author;
            this.price = price;
        }
        public void displayDetails(){
            System.out.println("Book Name : " + title);
            System.out.println("Book Author : " + author);
            System.out.println("Book Price : " + price);
        }
    }
    public static void main(String[] args){
        Q1 q1 = new Q1();
        Book book1 = q1.new Book();
        System.out.println("Book 1 details (default) : ");
        book1.displayDetails();
        Book book2 = q1.new Book("HP part - 1", "Jk Rowling", 599);
        System.out.println("Book 1 details (parameters) : ");
        book2.displayDetails();

    }
}
