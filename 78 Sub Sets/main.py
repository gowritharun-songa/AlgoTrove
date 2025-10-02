class Solution:
    def subSets(self, arr):
        result = []
        def sets(arr, res, i):
            if i == len(arr):
                result.append(res[:])
                return
            res.append(arr[i])
            sets(arr, res, i + 1)
            res.pop()
            sets(arr, res, i + 1)
        sets(arr, [], 0)
        return result

class Main:
    arr = [1, 2, 3]
    obj = Solution()
    res = obj.subSets(arr)
    print(res)