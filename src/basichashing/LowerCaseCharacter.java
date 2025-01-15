package basichashing;

import java.util.Scanner;

public class LowerCaseCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string =  scanner.next();

        int[] hash  = new int[26];
        for (int index = 0; index < string.length(); index++) {
            hash[string.charAt(index)- 'a']++;
        }

        int q;
        q = scanner.nextInt();
        while (q-- > 0) {
            char c;
            c = scanner.next().charAt(0);
            // fetch:
            System.out.println(hash[c - 'a']);
        }
    }
}
