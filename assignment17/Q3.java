package assignment17;

public class Q3 {
    public class Books{
        private String name;
        private String author;
        private int price;

        public Books(String name, String author, int price){
            this.name = name;
            this.author = author;
            this.price = price;
        }
        public void displayDetails(){
            System.out.println("Book name : " + name);
            System.out.println("Author name : " + author);
            System.out.println("Book price : " + price);
        }

    }
    public static void main(String[] args){
        Q3 q3 = new Q3();
        Books book1 = q3.new Books("HP-part 1", "JK Rowling", 450);
        Books book2 = q3.new Books("2 states", "Chetan Bhagat", 350);

        System.out.println("--BOOK 1--");
        book1.displayDetails();
        System.out.println("--BOOK 2--");
        book2.displayDetails();

    }
}
