package day2;

import java.util.Arrays;
public class MergeIntervalUsingBruteApproach {
    public int[][] merge(int[][] intervals) {
        int size = intervals.length;
        int[][] tempMatrix = new int[size][];
        tempMatrix[0][0]=intervals[0][0] ;
        for (int rows = 0; rows < size ; rows++) {
            for (int columns = 1; columns < size; columns++) {
                if(intervals[rows][columns]>intervals[rows][columns-1]) {
                    tempMatrix[rows][columns] = intervals[rows][columns];
                }
            }
        }
        return tempMatrix;
    }

    public static void main(String[] args) {
        MergeIntervalUsingBruteApproach mergeIntervalUsingBruteApproach = new MergeIntervalUsingBruteApproach();
        int[][] result = mergeIntervalUsingBruteApproach.merge(new int[][]{
                {1,3},{2,6},{8,10},{15,18}
        });
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }

}
