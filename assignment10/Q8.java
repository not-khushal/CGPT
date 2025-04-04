package assignment10;
import java.util.Scanner;
public class Q8 {
    
    public static String solution(int[] age, int[] height){
        if(age[0]>age[1] && age[0]>age[2]){
            if(height[0]>height[1] && height[0]>height[2]){
                return "Amar is oldest and tallest";
            } else if(height[1]>height[0] && height[1]>height[2]){
                return "Amar is oldest and Akbar is tallest";
            } else {
                return "Amar is oldest and Antony is tallest";
            }
        }
        else if(age[1]>age[0] && age[1]>age[2]){
            if(height[0]>height[1] && height[0]>height[2]){
                return "Akbar is oldest and Amar is tallest";
            } else if(height[1]>height[0] && height[1]>height[2]){
                return "Akbar is oldest and tallest";
            } else {
                return "Akbar is oldest and Antony is tallest";
            }
        }
        else {
            if(height[0]>height[1] && height[0]>height[2]){
                return "Antony is oldest and Amar is tallest";
            } else if(height[1]>height[0] && height[1]>height[2]){
                return "Antony is oldest and Akbar is tallest";
            } else {
                return "Antony is oldest and tallest";
            }
        }
    }
    
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int[] age = new int[3];
        int[] height = new int[3];
        System.out.println("Enter ages");
        for(int i=0; i<3; i++){
            System.out.println("Enter age " + (i+1));
            age[i] = myObj.nextInt();
        }
        System.out.println("Enter height");
        for(int i=0; i<3; i++){
            System.out.println("Enter height " + (i+1));
            height[i] = myObj.nextInt();
        }
        System.out.println(solution(age, height));
        myObj.close();
    }}
