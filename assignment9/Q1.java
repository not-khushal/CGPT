package assignment9;
import  java.util.Scanner;
public class Q1 {

    public class getData{
        public double simpleInterest(double p, double r, double t) {
            double si = (p*r*t)/100;
            return si;
        }
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the principle amount");
        double p = myObj.nextDouble();
        System.out.println("Enter the rate");
        double r = myObj.nextDouble();
        System.out.println("Enter the time");
        double t = myObj.nextDouble();

        getData data = new Q1().new getData();
        System.out.println("Simple Interest Amount is " + data.simpleInterest(p, r, t));
    }}
