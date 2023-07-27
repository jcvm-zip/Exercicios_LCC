#include <stdio.h>

main() {

    int compra;
    float valor = 9.99;

    printf ("Quantos produtos você comprou? ");
    scanf("%d", &compra);

    printf ("O valor da sua compra é R$ %.2f\n", compra*valor);
}
