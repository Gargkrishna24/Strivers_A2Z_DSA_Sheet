package recursion;


public class PrintNUmberFromOneToN {
    public static  void printNumberFromOneToN(int i , int n ){
        if(i>n)return;
        System.out.println(i);
        i++;
        printNumberFromOneToN(i,n);
    }

    public static void main(String[] args) {
        printNumberFromOneToN(1,10);
    }
}
