package assignment13;
import java.util.Scanner;

public class Q4 {
    public static int findLength(String text){
        int count = 0;
        try{
            while(true){
                text.charAt(count);
                count++;
            }
        } catch(StringIndexOutOfBoundsException e){
            return count;
        }
    }

    public static String[] splitText(String text){
        int wordCount = 1;
        for(int i=0; i<findLength(text); i++){
            if(text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount+1];
        spaceIndexes[0] = -1;
        int spaceCount = 1;
        for(int i=0; i<findLength(text); i++){
            if(text.charAt(i) == ' ') {
                spaceIndexes[spaceCount++] = i;
            }
        }
        spaceIndexes[wordCount] = findLength(text);

        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            words[i] = text.substring(spaceIndexes[i] + 1, spaceIndexes[i + 1]);
        }
        return words;
    }

    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for(int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static String compareLength(String[] words) {
        int largestLength = 0;
        int smallestLength = Integer.MAX_VALUE;
        
        for(String word : words) {
            int currentLength = findLength(word);
            if(currentLength > largestLength) {
                largestLength = currentLength;
            }
            if(currentLength < smallestLength) {
                smallestLength = currentLength;
            }
        }
        return "Largest length: " + largestLength + ", Smallest length: " + smallestLength;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter text");
        String text = myObj.nextLine();

        String[] words = splitText(text);
        String[][] wordLengths = getWordLengths(words);
        
        for(String[] pair : wordLengths) {
            System.out.println("Word: " + pair[0] + ", Length: " + pair[1]);
        }

        System.out.println(compareLength(words));
        
        myObj.close();
    }}