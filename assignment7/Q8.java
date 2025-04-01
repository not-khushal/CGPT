// 8. Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade as per the following guidelines
// Hint =>
// a. Take input for the number of students
// b. Create arrays to store marks, percentages, and grades of the students
// c. Take input for marks of students in physics, chemistry, and maths. If the marks are
// negative, ask the user to enter positive values and decrement the index
// d. Calculate the percentage and grade of the students based on the percentage
// e. Display the marks, percentages, and grades of each student


package assignment7;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int students = myObj.nextInt();

        double[] maths = new double[students];
        double[] physics = new double[students];
        double[] chemistry = new double[students];
        double[] avg = new double[students];
        String[] grade = new String[students];

        System.out.println("Enter marks of maths");
        for(int i=0; i<students; i++){
            maths[i] = myObj.nextInt();
        }

        System.out.println("Enter marks of physics");
        for(int i=0; i<students; i++){
            physics[i] = myObj.nextInt();
        }

        System.out.println("Enter marks of chemistry");
        for(int i=0; i<students; i++){
            chemistry[i] = myObj.nextInt();
        }

        for(int i=0; i<students; i++){
            avg[i] = (maths[i]+physics[i]+chemistry[i])/3;
        }

        for (int i = 0; i < avg.length; i++) {
            if(avg[i]>80){
                grade[i] = "A";
            }
            else if(avg[i]<80 && avg[i]>=70){
                grade[i] = "B";
            }
            else if(avg[i]<70 && avg[i]>=60){
                grade[i] = "C";
            }
            else if(avg[i]<60 && avg[i]>=50){
                grade[i] = "D";
            }
            else{
                grade[i] = "F";
            }

        }
        System.out.println("Results");
        for(int i=0; i<students; i++){
            System.out.println("The marks and grades of student " + (i+1 ) + " is " + (avg[i]) + " and " + (grade[i]));
        }
    }
}
