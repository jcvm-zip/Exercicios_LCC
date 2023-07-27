#include <stdio.h>
#include <stdlib.h>

int main() {
    int mat, i=0;
    float sal, men_sal;
    float med_sal = 0.0;

    for(i = 0;; i++){
        printf("Digite o numero da matricula %d: ", i+1);
        scanf("%d", &mat);
        
        if (mat != 0){
            printf("Digite o valor do seu salario: R$");
            scanf("%f", &sal);
            
            if (sal < men_sal || i == 0){
                men_sal = sal;
            }
        } else {
            break;
        }
        med_sal += sal;
    }
    
    printf("Salario medio R$%.2f\n", med_sal/i);
    printf("Menor salario R$%.2f\n\n", men_sal);
}
