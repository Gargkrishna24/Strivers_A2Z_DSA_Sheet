package sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public  void sorting(int[] array){
        for (int i = 0; i <= array.length-2; i++) {
            int miniIndex=i;
            for (int j = i+1; j <= array.length-1; j++) {
                if(array[miniIndex]>array[j]) miniIndex=j;
            }
            int temp = array[miniIndex];
            array[miniIndex]= array[i];
            array[i]=temp;
        }
    }
}
class Main{
    public static void main(String[] args) {
    SelectionSort selectionSort = new SelectionSort();
        int[] array = new int[]{5,3,16,15,4};
        selectionSort.sorting(array);
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));
    }
}
