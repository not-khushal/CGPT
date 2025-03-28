package assignment6;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter salary");
        double sal = myObj.nextDouble();
        System.out.println("Enter years");
        double years = myObj.nextDouble();

        double total = 0, bonus = 0.05;

        if(years >= 5){
            total = bonus*sal;
        }
        System.out.println("Bonus Amount" + total);
        System.out.println("Salary after bonus " + (sal+total));
    }
    
}
