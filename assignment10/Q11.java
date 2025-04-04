package assignment10;
import java.util.Scanner;
public class Q11 {
    
    public static String findingRoots(double a, double b, double c){
        double delta = (b*b)+(4*a*c);
        double root = 0;
        double  root1 = 0;
        double root2 = 0;

        System.out.println("value of delta " + delta);

        if(delta>0){
            root1 = (-b + Math.sqrt(delta))/(2*a);
            root1 = (-b - Math.sqrt(delta))/(2*a);
            return "Value of roots are " + root1 + " and " + root2;

        }
        else if(delta==0){
            root = -b/(2*a);
            return "Value of root is " + root;
        }
        else{

            return "Invalid";

        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the value of a, b and c");
        double a = myObj.nextDouble();
        double b = myObj.nextDouble();
        double c = myObj.nextDouble();

        System.out.println(findingRoots(a, b, c));
    }
}
