package basicmaths;
import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print the number : ");
        int number = scanner.nextInt();
        int count=0;
        int orginalNumber= number;
        while(number>0){
            int lastDigit = number % 10 ;
            if(orginalNumber%lastDigit==0){
                count++;
            }
            number = number / 10;
        }
        System.out.println("count = " + count);
    }
}
