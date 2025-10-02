#include<iostream>
#include<vector>

using namespace std;

class Solution {
    public:
        vector<int> setColors(vector<int>& arr) {

            int count0 = 0, count1 = 0, count2 = 0;

            for (int i : arr) {
                if (i == 0) count0++;
                else if (i == 1) count1++;
                else count2++;
            }

            int index = 0;

            for (int i = 0; i < count0; i ++) {
                arr[index++] = 0;
            }

            for (int i = 0; i < count1; i ++) {
                arr[index++] = 1;
            }

            for (int i = 0; i < count2; i ++) {
                arr[index++] = 2;
            }

            return arr;
        }

        vector<int> dutchFlagAlgo(vector<int>& arr) {
            int low = 0, mid = 0, high = arr.size() - 1;

            while (mid <= high) {

                if (arr[mid] == 0) {
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;

                    low += 1;
                    mid += 1;
                }

                else if (arr[mid] == 1) mid += 1;

                else {
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;

                    high -= 1;
                }
            }

            return arr;
        }
};

int main() {

    Solution solution;

    vector<int> arr = {2, 0, 2, 1, 1, 0, 1, 2, 0, 0};

    vector<int> res = solution.setColors(arr);

    for (int i : res) {
        cout << i << " " ;
    }

    cout << endl;

    vector<int> res2 = solution.dutchFlagAlgo(arr);

    for (int i : res2 ) {
        cout << i << " ";
    }

    return 0;
}