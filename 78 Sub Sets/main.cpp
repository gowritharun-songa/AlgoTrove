#include<iostream>
#include<vector>
using namespace std;

class Solution {
    public:
        vector<vector<int>> subSets(int arr[], int n) {
            vector<vector<int>> result = {};
            vector<int> ans = {};
            int i = 0;
            sets(arr, ans, i, n, result);
            return result;
        }
        void sets(int arr[], vector<int> &ans, int i, int n, vector<vector<int>> &result) {
            if(n == i) {
                result.push_back(ans);
                return;
            }
            ans.push_back(arr[i]);
            sets(arr, ans, i + 1, n, result);
            ans.pop_back();
            sets(arr, ans, i + 1, n, result);
        }
        
};

int main() {

    int arr[] = {1, 2, 3};
    int n = sizeof(arr) / sizeof(arr[0]);

    Solution obj;
    vector<vector<int>> result = obj.subSets(arr, n);

    for(auto vec : result) {
        cout << "[ ";
        for(int num : vec) {
            cout << num << " ";
        }
        cout << ']';
        cout << endl;
    }

    return 0;
}