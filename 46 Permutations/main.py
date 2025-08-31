class Solution:
    def permutations(self, arr):
        result, solution = [], []
        def backtrack(arr, result, solution):
            if len(solution) == len(arr):
                result.append(solution[:])
                return
            for val in arr:
                if val not in solution:
                    solution.append(val)
                    backtrack(arr, result, solution)
                    solution.pop()
        backtrack(arr, result, solution)
        return result

class Main:
    arr = [1, 2, 3]
    obj = Solution()
    res = obj.permutations(arr)
    print(res)