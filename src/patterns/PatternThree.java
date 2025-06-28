package patterns;

import java.util.Scanner;

public class PatternThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("numberOfLines = ");
        int numberOfLines = sc.nextInt();
        for (int rows = numberOfLines; rows > 0; rows--) {
            for (int columns = 0; columns < rows; columns++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

