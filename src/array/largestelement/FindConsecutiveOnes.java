package array.largestelement;

import java.util.Arrays;

public class FindConsecutiveOnes {
    public static int findConsecutiveOnes(int[] array) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] booleanArray = new int[]{1,0,1,0,1,1};
        int result = findConsecutiveOnes(booleanArray);
        System.out.println("result = " + result);
    }
}
