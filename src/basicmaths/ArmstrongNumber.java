package basicmaths;


public class ArmstrongNumber {
    public static boolean isArmstrongNumber(int n) {
        if (n < 0) {
            return false;
        }
        int orginalNumber = n;
        int count = 0;
        int temp = n;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
         temp = n ;
        int sum = 0 ;
        while(temp!=0){
            int digit = temp % 10;
            sum+= Math.pow(digit , count);
            temp = temp / 10;
        }
        return sum==n;
    }

    public static void main(String[] args) {
       boolean result =  isArmstrongNumber(1634);
        System.out.println("result = " + result);
    }
}
