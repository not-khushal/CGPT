package assignment12;

public class Q4 {
    // Method to generate NullPointerException
    private static void generateNullPointerException() {
        String text = null;
        // This will throw NullPointerException
        text.length();
    }
    
    // Method to handle NullPointerException
    private static void handleNullPointerException() {
        String text = null;
        try {
            text.length();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        // First generate the exception
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Exception in main: " + e.getMessage());
        }
        
        // Then handle the exception properly
        handleNullPointerException();
    }
}
