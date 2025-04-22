package assignment17;

public class Q4 {
    public class Items{
        private String code;
        private String name;
        private int price;

        public Items(String code, String name, int price){
            this.code = code;
            this.name = name;
            this.price = price;
        }
        public void displayDetails(){
            System.out.println("Item Code : " + code);
            System.out.println("Item Name : " + name);
            System.out.println("Item Price : " + price);
        }
        public int totalCost(int quantity){
            return price * quantity;
        }
    }
    public static void main(String[] args){
        Q4 q4 = new Q4();
        Items item1 = q4.new Items("001", "chair", 500);
        Items item2 = q4.new Items("002", "table", 800);

        System.out.println("--Item 1--");
        item1.displayDetails();
        System.out.println("--Item 2--");
        item2.displayDetails();

        System.out.println("Checking price for items");
        System.out.println("Total Cost for item 1: " + item1.totalCost(8));
        System.out.println("Total Cost for item 2: " + item2.totalCost(4));
    }
}
