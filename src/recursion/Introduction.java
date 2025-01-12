package recursion;

public class Introduction {
     static int count = 0 ;
    public static void printHello(){
        if(count==3)return;
        System.out.println("Hello");
        count++;
        printHello();
    }

    public static void main(String[] args) {
        printHello();
    }
}
