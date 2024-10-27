#include <iostream>
using namespace std;

int main() {
    int n, total = 0, a;
    
    cin >> n;
    
    for(int i = 0; i < n; i++) {
        cin >> a;
        total += a;
    }
    
    cout << total << endl;
    
    return 0;
}