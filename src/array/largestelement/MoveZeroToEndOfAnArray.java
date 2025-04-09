package array.largestelement;

public class MoveZeroToEndOfAnArray {
    public static int[] moveZero(int[] number){
        int j = -1;
        int n = number.length;
        for (int i = 0; i < n ; i++) {
            if(number[i]==0){
                j++;
                break;
            }
        }
        if(j==-1)return number;

        for (int i = j+1; i < n; i++) {
            if(number[i]!=0){
                int temp = number[j];
                number[j]=number[i];
                number[i]=temp;
                j++;
            }
        }
        return number;
    }

    public  static void main(String[] args) {
        int [] number = new int[]{0,1,2,0,0,0,1,2};
        int [] result = moveZero(number);
        System.out.println("result = " + result);
    }
}
