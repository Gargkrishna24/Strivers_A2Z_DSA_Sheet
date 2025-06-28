package patterns;

import java.util.Scanner;

public class PatternsFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("numberOfLines = ");
        int numberOfLines = sc.nextInt();
        for (int rows = 1; rows <= numberOfLines; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print(columns);
            }
            System.out.println();
        }
    }
}
