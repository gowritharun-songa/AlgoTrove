# Approach: 1

class Code:
    def setColors(self, nums):
        count0 = 0
        count1 = 0
        count2 = 0

        for i in range(len(nums)):
            if nums[i] == 0:
                count0 += 1
            elif nums[i] == 1:
                count1 += 1
            else:
                count2 += 1

        pos = 0

        for i in range(count0):
            nums[pos] = 0
            pos += 1

        for i in range(count1):
            nums[pos] = 1
            pos += 1
        
        for i in range(count2):
            nums[pos] = 2
            pos += 1

        return nums

# Time complexity: O(2n) ~ O(n)

#---------------------------------
    def dutchNationalFlag(self, nums):
        left = mid = 0
        right = len(nums) - 1

        while mid <= right:
            if nums[mid] == 0:
                nums[left], nums[mid] = nums[mid], nums[left]
                left += 1
                mid += 1
            elif nums[mid] == 1:
                mid += 1
            else:
                nums[mid], nums[right] = nums[right], nums[mid]
                right -= 1
        return nums
    
    # Time complexicty: O(n)

arr = [2, 0, 2, 1, 1, 0, 1, 2, 0, 0]
obj = Code()
print(obj.setColors(arr))
print(obj.dutchNationalFlag(arr))