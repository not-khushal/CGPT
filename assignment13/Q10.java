package assignment13;
import java.util.Scanner;
import java.util.Random;

public class Q10 {
    public static double[][] getMarks(int numStudents) {
        double[][] marks = new double[numStudents][3];
        Random rand = new Random();
        for(int i = 0; i < numStudents; i++) {
            for(int j = 0; j < 3; j++) {
                marks[i][j] = rand.nextInt(101);
            }
        }
        return marks;
    }

    public static double[][] calculateStats(double[][] marks) {
        double[][] stats = new double[marks.length][3]; // total, average, percentage
        for(int i = 0; i < marks.length; i++) {
            double total = 0;
            for(int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }
            stats[i][0] = Math.round(total * 100.0) / 100.0;
            stats[i][1] = Math.round((total / 3) * 100.0) / 100.0;
            stats[i][2] = Math.round((total / 300 * 100) * 100.0) / 100.0;
        }
        return stats;
    }

    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for(int i = 0; i < stats.length; i++) {
            double percentage = stats[i][2];
            if(percentage >= 90) grades[i] = "A+";
            else if(percentage >= 80) grades[i] = "A";
            else if(percentage >= 70) grades[i] = "B";
            else if(percentage >= 60) grades[i] = "C";
            else if(percentage >= 50) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void displayScorecard(double[][] marks, double[][] stats, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for(int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t\t%.2f\t%.2f\t%.2f\t%.2f%%\t\t%s\n",
                    i+1, marks[i][0], marks[i][1], marks[i][2],
                    stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        
        double[][] marks = getMarks(numStudents);
        double[][] stats = calculateStats(marks);
        String[] grades = calculateGrades(stats);
        displayScorecard(marks, stats, grades);
        
        sc.close();
    }
}