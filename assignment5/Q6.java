package assignment5;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter age of Amar");
        int age1 = myObj.nextInt();
        System.out.println("Enter age of Akbar");
        int age2 = myObj.nextInt();
        System.out.println("Enter age of Anthony");
        int age3 = myObj.nextInt();

        System.out.println("Enter height of Amar");
        int h1 = myObj.nextInt();
        System.out.println("Enter height of Akbar");
        int h2 = myObj.nextInt();
        System.out.println("Enter height of Antony");
        int h3 = myObj.nextInt();

        if(age1>age2 && age1>age3){
            System.out.println("Amar is oldest");
        }
        else if(age2>age3){
            System.out.println("Akbar is oldest");
        }
        else{
            System.out.println("Antony is oldest");
        }

        if(h1>h2 && h1>h3){
            System.out.println("Amar is tallest");
        }
        else if(h2>h3){
            System.out.println("Akbar is tallest");
        }
        else{
            System.out.println("Antony is tallest");
        }
    }
}
