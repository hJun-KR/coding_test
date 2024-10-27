#include <stdio.h>

int main() {
    int n, total = 0, a;
    
    scanf("%d", &n);
    
    for(int i = 0; i < n; i++) {
        scanf("%d", &a);
        total += a;
    }
    
    printf("%d\n", total);
    
    return 0;
}