package assignment6;
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = 1, sum = 0;

        while(num!=0){
            num = myObj.nextInt();
            if(num<0){break;}
            else{
                sum = num+sum;
            }
        }
        System.out.println("Sum is " + sum);
    }
}
