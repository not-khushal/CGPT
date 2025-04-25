package assignment18;

public class Q11 {
    public  static class Book{
        public double isbn;
        protected String title;
        private String author;

        public String getAuthor(){
            return author;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
        public void displayDetails(){
            System.out.println("ISBN : " + isbn);
            System.out.println("Title : " + title);
            System.out.println("Author Name : " + author);
        }
    }
    public class EBook extends Book{
        public EBook(double isbn, String title, String author){
            this.isbn = isbn;
            this.title = title;
            setAuthor(author);
        }
    }    public static void main(String[] args){
        Q11 q11 = new Q11();
        Book b1 = q11.new EBook(123456, "HP part 1", "JK Rowling");
        b1.displayDetails();
    }
}
