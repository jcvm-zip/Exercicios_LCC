#include<stdio.h>
int main() {
    int qtd;
    float compra;
    
    printf("Digite a quantidade de maçãs compradas: ");
    scanf("%d", &qtd);

    if (qtd >= 12) {
        compra= qtd * 1.00;
    } else {
        compra= qtd * 1.25;
    }
    
    printf("O valor de sua compra é: R$ %.2f\n", compra);
}
