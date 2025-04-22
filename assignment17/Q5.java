package assignment17;

public class Q5 {
    public class MobilePhone{
        private String brand;
        private String model;
        private int price;

        public MobilePhone(String brand, String model, int price){
            this.brand = brand;
            this.model = model;
            this.price = price;
        }
        public void displayDetails(){
            System.out.println("Brand Name : " + brand);
            System.out.println("Brand Model : " + model);
            System.out.println("Brand Price : " + price);
        }
    }
    public static void main(String[] args){
        Q5 q5 = new Q5();
        MobilePhone mobile1 = q5.new MobilePhone("apple", "16 pro", 65000);
        MobilePhone mobile2 = q5.new MobilePhone("samsung", "S25", 55000);
        MobilePhone mobile3 = q5.new MobilePhone("realme", "14 pro plus", 35000);

        System.out.println("--Mobile Phone 1");
        mobile1.displayDetails();
        System.out.println("--Mobile Phone 2");
        mobile2.displayDetails();
        System.out.println("--Mobile Phone 3");
        mobile3.displayDetails();
    }
}
