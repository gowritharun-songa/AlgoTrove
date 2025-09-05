class Solution:
    def rotateImage(self, matrix):
        n = len(matrix)
        m = len(matrix[0])

        # Transpose the array
        for i in range(n):
            for j in range(i + 1, n):
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

        # Reverse each row
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
    res = obj.rotateImage(matrix)

if __name__ == "__main__":
    main = Main()
    res = main.res
    for row in res:
        for ele in row:
            print(ele, end=' ')
        print()