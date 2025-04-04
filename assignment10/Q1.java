package assignment10;
import java.util.Scanner;

public class Q1 {

    public static String bigSolution(double number){
        int fact = 0;
        for(int i=1; i<=number; i++){
            if(number%i==0){
                fact++;
            }
        }
        int[] factArray = new int[fact];
        int index = 0;
        for(int i=1; i<=number; i++){
            if(number%i==0){
                factArray[index++] = i;
            }

        }   
        String str = java.util.Arrays.toString(factArray); 
        System.out.println("factors are " + str);
        double sum=0;
        double sumSquare=0;
        double product=1;
        for(int i=0; i<factArray.length; i++){
            sum += factArray[i];
            sumSquare += Math.pow(factArray[i], 2);
            product *= factArray[i];
        }


        return "Sum of factors is " + sum + 
                " Sum of square of factors is " + sumSquare + 
                " and Product is " + product;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        double inputNumber = myObj.nextDouble();
        System.out.println("The required answers for the input number for " + bigSolution(inputNumber));
        myObj.close();
    }
}
