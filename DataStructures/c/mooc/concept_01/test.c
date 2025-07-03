#include <stdio.h>
void PrintN(int N);
void PrintN1(int N);

int main(){
    int N;
    scanf("%d", &N);
    PrintN(N);
    PrintN1(N);
    printf("hello");
    return 0;
}

void PrintN (int N)
{
    int i;
    for( i=1; i<=N; i++){
        printf("%d\n", i);
    }
}

void PrintN1 (int N)
{
    if(N){
        PrintN1(N-1);
        printf("%d\n", N);
    }
    
}
