
package array.largestelement;

import java.util.Arrays;

public class rotateAnArrayByOnePlace {
    public static int[] rotateAnArrayByOnePlace(int[] array) {
        int firstElement = array[0];
        int lastElement = array.length-1;
        for (int index = 0; index < array.length - 1; index++) {
            array[index] = array[index+1];
        }
         array[lastElement] = firstElement;
        return array;
    }

    public static void main(String[] args) {
        int [] result = rotateAnArrayByOnePlace(new int[]{1,2,3,4,5,6,7});
        System.out.println("result = " + Arrays.toString(result));
    }

}

