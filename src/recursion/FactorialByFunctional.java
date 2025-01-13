package recursion;

public class FactorialByFunctional {
    public static int factorialByFunctional(int i) {
        if (i == 1) {
            return 1;
        }
        return i * factorialByFunctional(i - 1);
    }

    public static void main(String[] args) {
        int result = factorialByFunctional(10);
        System.out.println("result = " + result);
    }
}
