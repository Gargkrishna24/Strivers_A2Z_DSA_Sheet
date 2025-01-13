package recursion;


import java.util.Arrays;

public class ReversingAnArray {
    public static int[] reversingAnArray(int[] array,int firstIndex , int lastIndex ){
        if(firstIndex>lastIndex) return array;
        int temp= array[firstIndex];
        array[firstIndex]=array[lastIndex];
        array[lastIndex]=temp;
        return reversingAnArray(array,firstIndex+1,lastIndex-1);
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3} ;
        int[] swapArray = reversingAnArray(array,0,array.length-1);
        System.out.println("swapArray = " + Arrays.toString(swapArray));
    }
}
