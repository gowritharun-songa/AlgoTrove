class Main:
    def traping_rain_water(self, arr):
        left = 0
        right = len(arr) - 1

        left_max = arr[left]
        right_max = arr[right]

        water = 0

        while left < right:
            if arr[left] < arr[right]:
                left += 1
                left_max = max(left_max, arr[left])
                water += left_max - arr[left]
            else:
                right -= 1
                right_max = max(right_max, arr[right])
                water += right_max - arr[right]

        return water

obj = Main()
arr = [0,1,0,2,1,0,1,3,2,1,2,1]
res = obj.traping_rain_water(arr)
print(res)