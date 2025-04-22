package assignment17;

public class Q10 {
    public class CartItem{
        String itemName;
        int price;
        int quantity;

        public CartItem(String itemName, int price, int quantity){
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }
        public int addItem(int newQuantity){
            quantity = quantity+newQuantity;
            return quantity;
        }
        public int removeItem(int newQuantity){
            quantity = quantity-newQuantity;
            return quantity;
        }
        public void totalPrice(int price){
            int total = price*quantity;
            System.out.println(total);
        }
        public void displayDetails(){
            System.out.println("Item Name : " + itemName);
            System.out.println("Price : " + price);
            System.out.println("Quantity : " + quantity);
        }
    }
    public static void main(String[] args){
        Q10 q10 = new Q10();
        CartItem list1 = q10.new CartItem("Shoes", 30000, 2);
        CartItem list2 = q10.new CartItem("Socks", 600, 4);

        System.out.println("Display List Details");
        list1.displayDetails();
        list2.displayDetails();
        System.out.println("Display List1 Added Items");
        list1.addItem(0);
        list1.totalPrice(3000);
        System.out.println("Display List2 Removed Items");
        list2.removeItem(2);
        list2.totalPrice(600);
    }
}
