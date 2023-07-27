#include <stdio.h>

main ()
{
    float salAtual, valorReaj,salReaj;

    printf("Digite seu salario atual: ");
    scanf("%f", &salAtual);

    if (salAtual <= 1300)
        valorReaj = salAtual * 0.13;
    else if(salAtual > 1300 && salAtual <= 6000)
        valorReaj = salAtual * 0.12;
    else if(salAtual > 6000 && salAtual <= 15000)
        valorReaj = salAtual * 0.11;
    else if(salAtual > 15000)
        valorReaj = salAtual * 0.10;

    salReaj = salAtual + valorReaj;

    printf("Salario Atual é: %.2f\n", salAtual);
    printf("O valor do aumento é: %.2f\n", valorReaj);
    printf("O salário, após o aumento é de: %.2f\n", salReaj);
}
