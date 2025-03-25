package assignment4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = myObj.nextInt();

            for(int i=2; i<=num/2; i++){
                if(num%i==0){
                    System.out.println("Not a Prime Number");
                }
                else{
                    System.out.println("Prime Number");
                }
            }
    }
}
