package assignment4;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = myObj.nextInt();

        int sum = 0;

        for(int i=1; i<num; i++){
            if(num%i==0){
                sum += i;
            }
        }

        if(sum>num){
            System.out.println("Abudent Number");
        }
        else{
            System.out.println("Not Abundent Number");
        }
    }
}
