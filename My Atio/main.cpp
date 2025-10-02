#include <iostream>
#include <string>
#include <climits>

int myAtoi(const std::string& s) {
    int sign = 1, idx = 0;
    long res = 0;

    // Skip leading whitespaces
    while (idx < s.length() && s[idx] == ' ') {
        idx++;
    }

    // Determine the sign
    if (idx < s.length() && s[idx] == '-') {
        sign = -1;
        idx++;
    } else if (idx < s.length() && s[idx] == '+') {
        idx++;
    }

    // Build the result
    while (idx < s.length() && isdigit(s[idx])) {
        res = res * 10 + (s[idx] - '0');
        if (sign * res > INT_MAX) return INT_MAX;
        if (sign * res < INT_MIN) return INT_MIN;
        idx++;
    }

    return static_cast<int>(sign * res);
}

int main() {
    std::string s = "1337c0d3";
    int result = myAtoi(s);
    std::cout << result << std::endl;
    return 0;
}