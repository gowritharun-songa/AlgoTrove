class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};

        int res = solution.trapingRainWater(heights);

        System.out.println(res);
        
    }
}

class Solution {
    public int trapingRainWater(int[] heights) {

        int left = 0, right = heights.length - 1;
        int leftMax = heights[left], rightMax = heights[right];

        int water = 0;

        while ( left < right) {
            if ( leftMax < rightMax ) {
                left += 1;
                leftMax = Math.max(leftMax, heights[left]);
                water += leftMax - heights[left];
            } else {
                right -= 1;
                rightMax = Math.max(rightMax, heights[right]);
                water += rightMax - heights[right];
            }
        }
        return water;
    }
}