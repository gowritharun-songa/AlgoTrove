#include<iostream>
#include<vector>
using namespace std;

class Solution {
    public:
        vector<vector<int>> imageFlip(vector<vector<int>> &matrix) {
            // transpose the array
            int n = matrix.size();
            for(int i = 0; i < n; i++) {
                for(int j = i + 1; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            // reverse each row;
            for(vector<int> row : matrix) {
                int left = 0, right = row.size() - 1;
                while (left < right) {
                    swap(row[left], row[right]);
                    left++;
                    right--;
                }
            }
            return matrix;
        }
};

int main() {
    vector<vector<int>> matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    Solution obj;
    vector<vector<int>> result = obj.imageFlip(matrix); 
    for(vector<int> row : result) {
        for(int ele : row) {
            cout << ele << " ";
        }
        cout << endl;
    }

    return 0;
}