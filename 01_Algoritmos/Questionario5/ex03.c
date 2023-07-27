#include<stdio.h>

int main() {
    int num = 0;

    printf("\nDigite um numero inteiro para ver sua tabuada: ");
    scanf("%i", &num);

    for (int x = 0; x <= 10; ++x) {
        printf("%ix%i = %i \n", x, num, x*num);
    }

return 0;
}
