#include <stdio.h>
int main() {

    int valor;
    int i;
    int mv1 = 0;
    int mv2 = 0;

    for( i = 0; i < 3; i++ ) {        
        printf("Digite o valor :");
        scanf("%d",&valor);

        if( valor > mv1 ){      
            mv1 = valor;      
        continue;
        } 

        if( valor < mv1 && valor > mv2 ){
            mv2 = valor;      
        continue;
        }
    }
    printf("O primeiro maior numero e: %d\n", mv1);
    printf("O segundo maior numero e: %d\n", mv2);

return 0;
}
