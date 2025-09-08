class Solution:
    def imageFlip(self, matrix):
        # Transpose martix
        for i in range(len(matrix)):
            for j in range(i + 1, len(matrix)):
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]
        # Reverse entire row
        for row in matrix:
            left, right = 0, len(row) - 1
            while left < right:
                row[left], row[right] = row[right], row[left]
                left += 1
                right -= 1
        return matrix

class Main:
    matrix = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ]
    obj = Solution()
    res = obj.imageFlip(matrix)


if __name__ == "__main__":
    main = Main()
    for row in main.res:
        for ele in row:
            print(ele, end=" ")
        print()