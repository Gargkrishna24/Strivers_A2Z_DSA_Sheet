// given Row and column and tell about that element
package twodarray;

import java.util.Scanner;

public class PascalTriangle {

    public int nCr(int n , int  r){
        if (r > n) return 0;
        if (r == 0 || r == n) return 1;
        int result = 1 ;
        for (int i = 0; i < r ; i++) {
            result = result * (n-i);
            result = result / (i+1);
        }
        return result;
    }
}

class Main1{
    public static void main(String[] args) {
//        Scanner scanner = new Scanner();

        PascalTriangle pascalTriangle = new PascalTriangle();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        int result = pascalTriangle.nCr(n-1,r-1);
        System.out.println("result = " + result);
    }
}
