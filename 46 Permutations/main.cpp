#include <iostream>
#include <vector>
#include<algorithm>
using namespace std;

class Solution {
public:
    vector<vector<int>> permutations(vector<int>& arr) {
        vector<vector<int>> result;
        vector<int> sol;
        backtrack(arr, sol, result);
        return result;
    }

private:
    void backtrack(vector<int>& arr, vector<int>& sol, vector<vector<int>>& result) {
        if (sol.size() == arr.size()) {
            result.push_back(sol);
            return;
        }
        for (int val : arr) {
            if (find(sol.begin(), sol.end(), val) == sol.end()) {
                sol.push_back(val);
                backtrack(arr, sol, result);
                sol.pop_back();
            }
        }
    }
};

int main() {
    vector<int> arr = {1, 2, 3};
    Solution solution;
    vector<vector<int>> result = solution.permutations(arr);

    for (auto perm : result) {
        cout << "[ ";
        for (int num : perm) {
            cout << num << " ";
        }
        cout << "]\n";
    }

    return 0;
}