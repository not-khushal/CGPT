package assignment4;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter marks of Maths");
        float math = myObj.nextFloat();
        System.out.println("Enter marks of Physics");
        float phy = myObj.nextFloat();
        System.out.println("Enter marks of Chemistry");
        float chem = myObj.nextFloat();

        float avg = (math+phy+chem)/3;
        System.out.println("Average mark is " + avg);

        if(avg>=80){
            System.out.println("A");
        }
        else if(avg<80 && avg>=70){
            System.out.println("B");
        }
        else if(avg<70 && avg>=60){
            System.out.println("C");
        }
        else if(avg<60 && avg>=50){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}
