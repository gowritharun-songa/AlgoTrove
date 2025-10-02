#include<iostream>
#include<vector>
using namespace std;

class Solution {
    public:
        vector<vector<int>> imageFlip(vector<vector<int>> &matrix) {
            // Transpose the matrix
            for(int i = 0; i < matrix.size(); i++) {
                for(int j = i + 1; j < matrix[0].size(); j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            for(vector<int> row : matrix) {
                int left = 0, right = row.size() - 1;
                while(left < right) {
                    int temp = row[left];
                    row[left] = row[right];
                    row[right] = temp;

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