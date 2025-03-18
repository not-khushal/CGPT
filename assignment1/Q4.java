package assignment2;

public class Q4 {
    public static void main(String[] args) {
        int sp = 120;
        int cp = 100;
        int profit = sp-cp;
        double profitPercentage = (profit * 100.0) / cp;

        System.out.println("The profit is " + profit);
        System.out.println("The profit percentage is " + profitPercentage + "%");
    }
}