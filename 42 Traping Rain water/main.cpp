#include<iostream>
#include<vector>
using namespace std;

class Main {
    public:
        int trapingRainWater(vector<int>& vec) {
            int left = 0, right = vec.size() - 1;
            int leftMax = vec[left], rightMax = vec[right];

            int water = 0;

            while ( left < right ) {
                if (leftMax < rightMax) {
                    left += 1;
                    leftMax = max(leftMax, vec[left]);
                    water += leftMax - vec[left];
                } else {
                    right -= 1;
                    rightMax = max(rightMax, vec[right]);
                    water += rightMax - vec[right];
                }
            }

            return water;
        }
};

int main() {


    Main obj;

    vector<int> vec = {0,1,0,2,1,0,1,3,2,1,2,1};

    int res = obj.trapingRainWater(vec);

    cout << res << endl;

    return 0;
}