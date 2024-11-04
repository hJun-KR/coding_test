#include <stdio.h>

main(){
    int input, i, j;
    
    scanf("%d", &input);
    
    for(i = 1; i <= input; i++){
        for(j = 1; j <= i; j++) {
            printf("*");
        }
        printf("\n");
    }
    
    return 0;
}