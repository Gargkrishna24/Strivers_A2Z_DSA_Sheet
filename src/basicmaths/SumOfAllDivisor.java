package basicmaths;

import java.util.Scanner;

public class SumOfAllDivisor {
    public static int sumOfAllDivisor(int n) {
        int sum = 0;
            for (int i = 1; i <= n; i++) {
                for(int j = 1 ; j<=i;j++){
                    if(i%j==0){
                        sum=sum+j;
                    }
                }
            }

        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumOfAllDivisor(n));
    }
}


