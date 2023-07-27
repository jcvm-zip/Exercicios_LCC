#include <stdio.h>

int main() {
    int valor;
    
    printf("Digite um numero inteiro: ");
    scanf("%d", &valor);

    printf("Antecessor de %d = %d", valor, (valor-1));
}