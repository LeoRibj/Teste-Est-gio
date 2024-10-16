#include<stdlib.h>
#include <stdio.h>

int main(){
    int indice = 12;
    int k = 1;
    int soma= 0 ;
    while (k<indice)
    {
        k=k+1;
        soma=soma+k;
    }
    printf("%d",soma);
}