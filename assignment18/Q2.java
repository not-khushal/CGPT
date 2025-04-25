package assignment18;

public class Q2 {
    public class Circle{
        double radius;

        Circle(){
            radius = 5;
        }
        Circle(double radius){
            this.radius = radius;
        }
        public void circleArea(){
            double area = 3.14*radius*radius;
            System.out.println("Area of Circle : " + area);
        }
        public void displayDetails(){
            System.out.println("Radius of Circle : " + radius);
        }
    }
    public static void main(String[] args){
        Q2 q2 = new Q2();
        Circle c1 = q2.new Circle();
        System.out.println("Details of Circle 1(default)");
        c1.displayDetails();
        c1.circleArea();
        Circle c2 = q2.new Circle(10);
        System.out.println("Details of Circle 2(parameters)");
        c2.displayDetails();
        c2.circleArea();
    }
}
