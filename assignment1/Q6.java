package assignment2;

public class Q6 {
    public static void main(String[] args) {
        double total = 125000;
        double discount = 0.1;
        double fees = total*discount;
        System.out.println("the discount offered is " + fees);
        System.out.println("the amount ot be paid is " + (total-fees));
    }
}
