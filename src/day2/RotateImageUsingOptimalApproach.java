package day2;

public class RotateImageUsingOptimalApproach {
    public void rotate(int[][] matrix){
        for (int rows = 0; rows < matrix.length ; rows++) {
            for (int columns = rows+1; columns < matrix.length ; columns++) {
                int temp = matrix[rows][columns];
                matrix[rows][columns]=matrix[columns][rows];
                matrix[columns][rows]=temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int left = 0, right = matrix.length - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        for(int[] rows:matrix){
            for(int val :rows){
                System.out.print(val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RotateImageUsingOptimalApproach rotateImageUsingOptimalApproach = new RotateImageUsingOptimalApproach();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {8, 9, 1}
        };
        rotateImageUsingOptimalApproach.rotate(matrix);
    }
}
