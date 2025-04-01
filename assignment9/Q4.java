package assignment9;
import java.util.Scanner;
public class Q4 {

    public class getData{
        public double sides(double side1, double side2, double side3){
            double perimeter = side1+side2+side3;
            double rounds = perimeter/5;
            return rounds;
        }
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter length of first side");
        double s1 = myObj.nextDouble();
        System.out.println("Enter length of second side");
        double s2 = myObj.nextDouble();
        System.out.println("Enter length of third side");
        double s3 = myObj.nextDouble();

        getData data = new Q4().new getData();
        System.out.println("The athlete will complete " + data.sides(s1, s2, s3));
    }
}
