package assignment17;

public class Q2 {
    public class Circle{
        private double radius;

        public Circle(double radius){
            this.radius = radius;
        }
        public double calculateCircumference(double radius){
            double circumference = 2*3.14*radius;
            return circumference;
        }
        public double calculateArea(double radius) {
            double area = 2 * 3.14 * radius;
            return area;
        }
        public void displayDetails(){
            System.out.println("Radius of circle is " + radius);
            System.out.println("Circumference of circle is " + calculateCircumference(radius));
            System.out.println("Area of circle is " + calculateArea(radius));
        }
    }
    public static void main(String[] args){
        Q2 q2 = new Q2();
        Circle circle1 = q2.new Circle(5);
        Circle circle2 = q2.new Circle(15);

        System.out.println("--CIRCLE 1--");
        circle1.displayDetails();
        System.out.println("--CIRCLE 2--");
        circle2.displayDetails();
    }

}
