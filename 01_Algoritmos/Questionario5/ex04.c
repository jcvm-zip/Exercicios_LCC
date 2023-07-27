#include <stdio.h>
#include <stdlib.h>

main ()
{
    int homem[5] ,mulher[5] ,i ,mulher_mais_velha, mulher_mais_nova, homem_mais_velho, homem_mais_novo, soma, produto;
    for(i=0; i<5 ;i++){
        printf("Digite a idade da Mulher %d: ",i+1);
        scanf("%d",&mulher[i]);
    }

    mulher_mais_velha = mulher[0];
    mulher_mais_nova = mulher[0];
    for (i=0;i<5;i++){
        if (mulher[i] > mulher_mais_velha){
        mulher_mais_velha = mulher[i];
        }
        else if (mulher[i] < mulher_mais_nova){
        mulher_mais_nova = mulher[i];
        }
    }

    for(i=0; i<5 ;i++){
        printf("Digite a idade do homem %d: ",i+1);
        scanf("%d",&homem[i]);
    }

    homem_mais_novo = homem[0];
    homem_mais_velho = homem[0];
    for (i=0;i<5;i++){
        if (homem[i] < homem_mais_novo){
        homem_mais_novo = homem[i];
        }
        else if (homem[i] > homem_mais_velho){
        homem_mais_velho = homem[i];
        }
    }

    soma = mulher_mais_velha + homem_mais_novo;
    produto = homem_mais_velho * mulher_mais_nova;

 
    printf("A mulher mais Velha tem: %d anos\n",mulher_mais_velha);
    printf("O Homem mais novo tem: %d anos\n", homem_mais_novo);
    printf("A mulher mais nova tem: %d anos\n",mulher_mais_nova);
    printf("O Homem mais velho tem: %d anos\n", homem_mais_velho);

    printf("A soma das idades do homem mais novo com a mulher mais velha é: %d \n", soma);
    printf("O produto das idades do homem mais velho com a mulher mais nova: %d \n", produto);
}
