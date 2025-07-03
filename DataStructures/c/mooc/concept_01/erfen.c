#include <stdio.h>
#define elementType int

int main()
{
    return 0;
}

int erfen(int left, int right, elementType List[], elementType X)
{
    if(left > right){
        return -1;
    }
    int M = (left+right)/2;
    if(List[M] == X)
    {
        return M;
    } else if (List[M] > X)
    {
        erfen(left, M-1, List, X);   
    } else
    {
        erfen(M+1, right, List, X);   //用最小0 1 2尝试
    }
    
    return -1;
}