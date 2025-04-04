


// package assignment10;
// import java.util.Scanner;
// public class Q9 {
    
//     public static String checkStatus(int[] number){
//         String result = "";
//         for(int i=0; i<5; i++){
//             if(number[i]==0){
//                 result = "Zero";
//             }
//             else if(number[i]<0){
//                 result = "Negative";
//             }
//             else{
//                 result = "Positive";
//             }
//         }
//         return result;
//     }

//     public static String positiveStatus(int[] number){
//         String results = "";
//         for(int i=0; i<5; i++){
//             if(number[i]>0){
//                 if(number[i]%2==0){
//                     results = "Even";
//                 }
//                 else{
//                     results = "Odd";
//                 }
//             }
//         }
//         return results;
//     }

//     public static String comparision(int[] number){
//         String results = ""; 
//         for(int i=0; i<5; i++){
//             if(number[0] == number[4]){
//                 results = "First and Last are Same";
//             }
//             else if(number[0] > number[4]){
//                 results = "First element is larger than second element";
//             }
//             else{
//                 results = "Second element is larger than first element";
//             }
//         }
//         return results;
//     }

//     public static void main(String[] args) {
//         Scanner myObj = new Scanner(System.in);
//         System.out.println("Enter the numbers of the array");
//         int[] number = new int[5];
//         for(int i=0; i<5; i++){
//             number[i] = myObj.nextInt();
//         }
//         System.out.println("To check the status of each element " + checkStatus(number));
//         System.out.println("To check the status of positive element " + positiveStatus(number));
//         System.out.println("To compare the first and last elements of the array " + comparision(number));
//     }
// }
package assignment10;
import java.util.Scanner;

public class Q9 {
    
    public static String checkStatus(int number) {
        if (number == 0) {
            return "Zero";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Positive";
        }
    }

    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        int[] numbers = new int[5];
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = myObj.nextInt();
        }
        
        for (int i = 0; i < numbers.length; i++) {
            String status = checkStatus(numbers[i]);
            System.out.print("Number " + numbers[i] + " is " + status);
            if (status.equals("Positive")) {
                System.out.println(" and " + isEven(numbers[i]));
            } else {
                System.out.println();
            }
        }
        
        int compareResult = compare(numbers[0], numbers[4]);
        if (compareResult == 0) {
            System.out.println("First and last elements are equal");
        } else if (compareResult == 1) {
            System.out.println("First element is greater than last element");
        } else {
            System.out.println("First element is less than last element");
        }
        
        myObj.close();
    }
}