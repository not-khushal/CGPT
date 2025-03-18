package assignment2;

public class Q5 {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;
        int equality = pens/students;
        int remaining = pens - equality*students;
        System.out.println("The pen per student is " + equality + "and the remaining pens are " + remaining);
    }
}
