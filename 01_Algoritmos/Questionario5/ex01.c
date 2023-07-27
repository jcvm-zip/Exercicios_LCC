#include <stdio.h>

int main(void){
    int c = 0, D[10];

    for(int i = 0; i < 10; i++){
        printf("Digite o valor da posição no vetor %d: ", i+1);        
        scanf("%d", &c);
        D[i] = c;
    }

    for (int i = 0; i < 10; i++){
        if (D[i] > 0 ){
            printf("%d\n", D[i]);
        }
    }     
}
