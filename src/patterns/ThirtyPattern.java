package patterns;
import java.util.Scanner;
public class ThirtyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfRows = sc.nextInt();
        for (int rows = 0; rows < numberOfRows; rows++) {
            int noOfSpaces = numberOfRows-rows-1 ;
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print("  ");
            }
            for (int cols = 0; cols < 2*rows+1 ; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}