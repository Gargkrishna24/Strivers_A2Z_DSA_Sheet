package recursion;

public class PrintNumberFromNToOne {
    public static void printNumberFromNToOne(int i , int n){
        if(n < i )return;
        System.out.println(n);
        n--;
        printNumberFromNToOne(i,n);
    }

    public static void main(String[] args) {
        printNumberFromNToOne(1,25);
    }
}
