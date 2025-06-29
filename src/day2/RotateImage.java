package day2;

public class RotateImage {
    public void rotate(int[][] matrix) {
        // Create a temporary matrix with transposed dimensions (columns = rows, rows = columns)
        int[][] tempMatrix = new int[matrix[0].length][matrix.length];

        for (int rows = 0; rows < matrix.length; rows++) {
            for (int columns = 0; columns < matrix[0].length; columns++) {
                tempMatrix[columns][(matrix.length - 1) - rows] = matrix[rows][columns];
            }
        }

        System.out.println("Rotated Matrix:");
        for (int[] row : tempMatrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RotateImage rotateImage = new RotateImage();
        int[][] matrix = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {8, 9, 1, 2}
        };
        rotateImage.rotate(matrix);
    }
}
