#include <stdio.h>
int main() 
{
    int MAT[3][4] = {{0}};
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            printf("Digite os numeros da matriz para a seguinte posição: [%d][%d] \n", i+1, j+1);
            scanf("%d", &MAT[i][j]);
        }
    }

    int soma = 0;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
           soma += MAT[i][j];
        }
    }
    
    printf("\nMédia: %d", soma / 12);
    printf("\n");
}