package assignment14;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string");
        String text = myObj.next();
        
        int freq[] = new int[256];
        char max = text.charAt(0);

        for(int i=0; i<text.length(); i++){
            freq[text.charAt(i)]++;
            if(freq[text.charAt(i)]>freq[max]){
                max = text.charAt(i);
            }
        }
        System.out.println("Most Frequent Character " + max);
        System.out.println("Frequency Count " + freq[max]);
    }
}