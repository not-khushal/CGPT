package assignment6;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter age");
        int age = myObj.nextInt();

        if(age>=18){
            System.out.println("Person can vote");
        }
        else{
            System.out.println("Person cannot vote");
        }
    }
}
