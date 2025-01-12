package recursion;

public class PrintNameNTimes {
    public static void printNameNTimes(int i , int n )  {
        if(i>n)return;
        System.out.println("Krishna Garg");
        i++;
        printNameNTimes(i,n);
    }

    public static void main(String[] args) {
        printNameNTimes(1,5);
    }
}
