package assignment13;
import java.util.Scanner;

public class Q7 {
    public static int[] findTrimBounds(String str) {
        int start = 0;
        int end = str.length() - 1;
        
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }
        
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        
        return new int[]{start, end};
    }
    
    public static String customSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
    
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with leading/trailing spaces:");
        String input = scanner.nextLine();
        
        // Custom trim using charAt()
        int[] bounds = findTrimBounds(input);
        String customTrimmed = customSubstring(input, bounds[0], bounds[1]);
        
        // Built-in trim
        String builtInTrimmed = input.trim();
        
        // Compare results
        boolean areEqual = compareStrings(customTrimmed, builtInTrimmed);
        
        System.out.println("Custom trimmed: '" + customTrimmed + "'");
        System.out.println("Built-in trimmed: '" + builtInTrimmed + "'");
        System.out.println("Strings are equal: " + areEqual);
        
        scanner.close();
    }
}