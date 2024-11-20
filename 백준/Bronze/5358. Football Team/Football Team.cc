#include <iostream>
#include <cstring>
#include <algorithm>
#include <vector>
#include <cmath>

using namespace std;

#define fast ios_base::sync_with_stdio(false); cin.tie(0), cout.tie(0)
#define ll long long

int main() {
    fast;
    string s;
    while (1) {
        getline(cin, s);
        if (cin.eof()) break;
        for (int i = 0; i < s.length(); i++) {
            if (s[i] == 'e') cout << 'i';
            else if (s[i] == 'i') cout << 'e';
            else if (s[i] == 'E') cout << 'I';
            else if (s[i] == 'I') cout << 'E';
            else cout << s[i];
        }
        cout << "\n";
    }
}