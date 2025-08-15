#include<iostream>
#include<vector>
#include<string>
using namespace std;

class Main {
    public:
        bool searchElement(vector<vector<int>> matrix, int target ) {
            int m = matrix.size();
            int n = matrix[0].size();

            int left = 0;
            int right = m * n - 1;

            while (left <= right) {
                int mid = left + (right - left ) / 2;
                int i = mid / n;
                int j = mid % n;

                if (matrix[i][j] == target) {
                    return true;
                } else if(matrix[i][j] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return false;
        }
};

int main() {

    vector<vector<int>> matrix = {
        {1, 3, 5, 7},
        {10, 11, 16, 20},
        {23, 30, 34, 60}
    };

    int target = 3;

    Main main;
    string res = main.searchElement(matrix, target) == 1 ? "true" : "false";

    cout << res << endl;

    return 0;
}