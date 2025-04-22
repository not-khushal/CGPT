package assignment17;

public class Q8 {
    public class PalindromeChecker {
        private String text;

        public PalindromeChecker(String text) {
            this.text = text;
        }
        public String checkPalindrome(String text){
            String rev = "";
            char ch;
            for(int i=0; i<text.length(); i++){
                ch = text.charAt(i);
                rev = ch + rev;
            }
            if(rev.equals(text)){
                return "It is a palindrome";
            }
            else{
                return "It is not a palindrome";
            }
        }
    }
    public static void main(String[] args){
        Q8 q8 = new Q8();
        PalindromeChecker text1 = q8.new PalindromeChecker("");
        System.out.println(text1.checkPalindrome("namaan"));
    }
}