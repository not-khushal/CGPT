package assignment6;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = myObj.nextInt();

        if(num<1){
            System.out.println("It is not a natural number");
        }
        else{
            int sum = (num*(num+1))/2;
            System.out.println("Sum of first " + num + "is " + sum);
        }

    }}
