// package assignment6;
// import java.util.Scanner;
// public class Q7 {
//     public static void main(String[] args) {
//         Scanner myObj = new Scanner(System.in);
//         System.out.println("Enter month number");
//         int month = myObj.nextInt();
//         System.out.println("Enter date number");
//         int date = myObj.nextInt();
        
//         if((month==3 && date>20) || (month==4 && date!=0) || (month==5 && date!=20) || (month==6 && date<20)){
//             System.out.println("It is a Spring month");
//         }
//         else{
//             System.out.println("It is not a Spring month");
//         }
//     }
// }


package assignment9;
import java.util.Scanner;
public class Q6 {
    public static String season(int date, int month) {
        if((month==3 && date>20) || (month==4 && date!=0) || (month==5 && date!=20) || (month==6 && date<20)) {
            System.out.println("It is a Spring month");
        }
        else {
            System.out.println("It is not a Spring month");
        }
        return "date is " + date + " and month is " + month;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the date");
        int d = myObj.nextInt();
        System.out.println("Enter the month");
        int m = myObj.nextInt();

        System.out.println(season(d, m));
    }
}