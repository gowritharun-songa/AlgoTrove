class Main:
    def search2DMatrix(self, matrix, target = 3):
        m, n = len(matrix), len(matrix[0])

        left = 0
        right = m * n - 1

        while left <= right:
            mid = (left + right) // 2
            i = mid // n
            j = mid % n

            if target == matrix[i][j]:
                return True
            
            elif target > matrix[i][j]:
                left = mid + 1
            else:
                right = mid - 1
        
        return False

obj = Main()
matrix = [
    [1, 3, 5, 7],
    [10, 11, 16, 20],
    [23, 30, 34, 60]
]

res = obj.search2DMatrix(matrix)
print(res)