package sorting.BubbleSort;

import java.util.Arrays;

public class Sorting {
    public  void sort(int[] array) {
        for (int i = array.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
class Main{
    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        int[] array = new int[]{13,45,24,52,20,9};
        sorting.sort(array);
        System.out.println((Arrays.toString(array)));
    }
}

