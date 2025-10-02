class Code {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Solution solution = new Solution();
        int[][] result = solution.imageFlip(matrix);
        for(int[] row : result) {
            for(int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}

class Solution {    
    public int[][] imageFlip(int[][] matrix) {
        // transpose the matrix
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i + 1; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Reverse the entire row;
        for(int[] row : matrix) {
            int left = 0, right = row.length - 1;
            while(left < right) {
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;

                left++;
                right--;
            }
        }
        return matrix;
    }
}