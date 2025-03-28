package assignment6;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = myObj.nextInt();

        int num2 = (num1*(num1+1))/2;
        int total = 0;
        int num3 = 1;
        while(num3<=num1){
            total += num3;
            num3++;
        }
        System.out.println(num2);
        System.out.println(total);
    }
}
