package basicmaths;

public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
class Main{
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        boolean x = palindrome.isPalindrome(2147483647);
        System.out.println("x = " + x);
    }
}
