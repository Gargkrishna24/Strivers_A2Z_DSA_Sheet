package patterns;

import java.util.Scanner;

public class patternFive
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("numberOfLines = ");
        int numberOfLines = sc.nextInt();
        for (int rows = 1; rows <= 2*numberOfLines; rows++) {
            int noOfColumnsInRow= rows>numberOfLines?2*numberOfLines-rows:rows;
            for (int columns = 1; columns <= noOfColumnsInRow; columns++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
