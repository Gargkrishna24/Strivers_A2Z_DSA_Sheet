package recursion;


import java.util.Scanner;

public class StringIsPalindromeOrNot {
    public static boolean checkPalindrome(String word,int firstIndex,int lastIndex){
        if(firstIndex>=lastIndex) return true;
        if(word.charAt(firstIndex)!=word.charAt(lastIndex)) return false  ;
        return checkPalindrome(word,firstIndex+1,lastIndex-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        word=word.replaceAll("\\s+", "").toLowerCase();
        boolean result = checkPalindrome(word,0,word.length()-1);
        System.out.println("result = " + result);
    }
}
