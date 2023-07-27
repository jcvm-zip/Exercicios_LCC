#include <stdio.h>
#include <stdlib.h>
int main() {

    char time1[10], time2[10];
    int golstime1, golstime2;

    printf("Qual o nome do primeiro time: ");
    scanf("%s", &time1);

    printf("Quantos gols foram feitos pelo time %s: ", time1);
    scanf("%d",&golstime1);

    printf("Qual o nome do segundo time: ");
    scanf("%s", &time2);

    printf("Quantos gols foram feitos pelo time %s: ", time2);
    scanf("%d",&golstime2);

   
    if (golstime1 > golstime2)
    {
        printf("%s %d x %d %s",time1, golstime1, golstime2, time2);
        printf("\nO time campeão é o %s\n", time1);
    }
    else if (golstime1 < golstime2)
    {
        printf("%s %d x %d %s",time2, golstime2, golstime1, time1);
        printf("\nO time campeão é o %s\n", time2);
    }
    else
    {
        printf("%s %d x %d %s\n",time1, golstime1, golstime2, time2);
        printf("\nEMPATE");
    }
return (0);
}
