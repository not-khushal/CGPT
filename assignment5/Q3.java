package assignment5;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = myObj.nextInt();

        if(num>=6 && num<=9){
            for(int i=1; i<=10; i++){
                System.out.println("the multiplication table is " + num + "x" + i + "=" + (num*i));
            }
        }
    }}