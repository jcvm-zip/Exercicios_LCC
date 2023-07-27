#include<stdio.h>
int main() {
    int estoqueAtual, estoqueMax;
    float media;
    printf("Estoque atual: ");
    scanf("%d", &estoqueAtual);
    
    printf("Estoque máximo: ");
    scanf("%d", &estoqueMax);

    media = (float) (estoqueAtual + estoqueMax)/2;

    if (estoqueAtual >= media) {
        printf("Não efetuar compra\n");
    } else {
        printf("Efetuar compra\n");
    }
}