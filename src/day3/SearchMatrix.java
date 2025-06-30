package day3;

public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int columns= 0; columns <matrix.length ; columns++) {
                if(matrix[rows][columns]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
