package assignment13;
import java.util.Scanner;

public class Q5 {
    public static int charCounts(String text){
        text = text.toLowerCase();
        int vCount = 0;
        int cCount = 0;
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u'){
                vCount++;
            }

        }
        return vCount;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string");
        String text = myObj.next();

        System.out.println(charCounts(text));
    }
}
