package patterns;

import java.util.Scanner;

public class patternTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("numberOfLines = ");
        int numberOfLines = sc.nextInt();
        for (int i = 0; i < numberOfLines; i++) {
            for (int j = 0; j < numberOfLines; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
