class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Solution solution = new Solution();
        int[][] flippedMatrix = solution.imageFlip(matrix);
        // Traverse through the Matrix
        for(int[] row : flippedMatrix) {
            for(int ele : row ) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    public int[][] imageFlip(int[][] matrix) {
        int n = matrix.length;

        // Transpose the matrix
        for(int i = 0; i < n; i += 1) {
            for(int j = i + 1; j < n; j ++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Reverse entire row;
        for(int[] row : matrix) {
            int left = 0, right = row.length - 1;
            while (left < right) {
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;

                left += 1;
                right -= 1;
            }
        }
        return matrix;
    }
}