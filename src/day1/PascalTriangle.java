package day1;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();
        for (int row = 1; row <= numRows; row++) {
            int noOfSpaces = numRows -row- 1;
            for (int j = 1; j <= noOfSpaces; j++) {
                System.out.print(" ");
            }
            int number = 1;
            for (int col = 1; col <= row; col++) {
                System.out.print(number + " ");
                // Calculate next value in the row
                number = number * (row - col) / (col + 1);
            }
            System.out.println();

        }
    }
}
