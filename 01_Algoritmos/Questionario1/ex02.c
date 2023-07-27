#include <stdio.h>

main() {

    int homem, mulher, homenT = 3, mulherT = 4;

    printf ("Quantos homens estão na festa? ");
    scanf("%d",&homem);

    printf ("Quantos Mulheres estão na festa? ");
    scanf("%d",&mulher);

    printf ("A quantidade total de latas de refrigerante necessaria é de %d\n", homem*homenT+mulherT*mulher);
}
