package sorting.insertionSorting;

import java.util.Arrays;

public class Sorting {
    public void sort(int[] array)
    {
        for (int index = 0; index < array.length; index++) {
            int temp = index;
            while(temp>0&&array[index-1]>=array[temp]) {
                int count = array[temp-1];
                array[temp-1]= array[temp];
                array[temp]=count;
                temp--;
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
