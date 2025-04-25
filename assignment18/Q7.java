package assignment18;

public class Q7 {
    public class Product{
        String productName;
        int price;
        static int totalProducts;

        Product(String productName, int price){
            this.productName = productName;
            this.price = price;
            totalProducts++;
        }
        void displayProductDetails(){
            System.out.println("Name of product : " + productName);
            System.out.println("Price of product : " + price);
        }
        static void displayTotalProducts(){
            System.out.println("Total products : " + totalProducts);
        }
    }
    public static void main(String[] args){
        Q7 q7 = new Q7();
        Product p1 = q7.new Product("Shoes", 5999);
        Product p2 = q7.new Product("Socks", 699);

        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}
