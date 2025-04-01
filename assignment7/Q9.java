package assignment7;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int students = myObj.nextInt();

        int[][] data = new int[students][4];
        String[] grade = new String[students];

        System.out.println("Enter marks of each student");
        for(int i=0; i<students; i++){
            System.out.println("Student " + (i+1));
            System.out.println("Enter marks of maths");
            data[i][0] = myObj.nextInt();
            while(data[i][0]<0){
                System.out.println("Cannot be negative");
                data[i][0] = myObj.nextInt();
            }
            System.out.println("Enter marks of physics");
            data[i][0] = myObj.nextInt();
            while(data[i][1]<0){
                System.out.println("Cannot be negative");
                data[i][1] = myObj.nextInt();
            }            System.out.println("Enter marks of chemistry");
            data[i][0] = myObj.nextInt();
            while(data[i][2]<0){
                System.out.println("Cannot be negative");
                data[i][2] = myObj.nextInt();
            }

            data[i][3] = (data[i][0] + data[i][1] + data[i][2])/3;

            if(data[i][3]>80){
                grade[i] = "A";
            }
            else if(data[i][3]<80 && data[i][3]>=70){
                grade[i] = "B";
            }
            else if(data[i][3]<70 && data[i][3]>=60){
                grade[i] = "C";
            }
            else if(data[i][3]<60 && data[i][3]>=50){
                grade[i] = "D";
            }
            else{
                grade[i] = "F";
            }
        }

        System.out.println("Results ");
        for(int i=0; i<students; i++){
            System.out.println("The marks and grades of student " + (i+1 ) + " is " + (data[i][3]) + " and " + (grade[i]));
        }
    }
}
