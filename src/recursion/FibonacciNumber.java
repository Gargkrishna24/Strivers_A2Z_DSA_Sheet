package recursion;

public class FibonacciNumber {
    public static int checkFibonacciNumber(int number){
        if(number==0||number==1)return number;
        return checkFibonacciNumber(number-1) + checkFibonacciNumber(number-2);
    }
    public static void main(String[] args) {
        int result = checkFibonacciNumber(5);
        System.out.println("result = " + result);
    }
}
