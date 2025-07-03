#include <stdio.h>

int MaxSubseqSum1( int A[], int N );
int MaxSubseqSum2( int A[], int N );
int MaxSubseqSum3( int A[], int N );
int MaxSubseqSum4( int A[], int N );
int DivideAndConquer( int List[], int left, int right );
int Max3( int A, int B, int C);

int main()
{
    int N = 8;
    int A[] = {-1,3,-2,4,-6,1,6,-1};
    int sum1 = MaxSubseqSum1(A,N);
    printf("%d\n",sum1);
    int sum2 = MaxSubseqSum2(A,N);
    printf("%d\n",sum2);
    int sum3 = MaxSubseqSum3(A,N);
    printf("%d\n",sum3);
    int sum4 = MaxSubseqSum4(A,N);
    printf("%d\n",sum4);
}

int MaxSubseqSum1( int A[], int N )
{
    int ThisSum, MaxSum = 0;
    int i, j, k;
    for ( i = 0; i < N; i++)
    {
        for ( j = i; j < N; j++)
        {
            ThisSum = 0;
            for ( k = i; k <= j; k++)
            {
                ThisSum += A[k];    
            }
            if (ThisSum > MaxSum)
            {
                MaxSum = ThisSum;
            }
        }
    }
    return MaxSum;
}

int MaxSubseqSum2( int A[], int N )
{
    int ThisSum, MaxSum = 0;
    int i, j;
    for ( i = 0; i < N; i++)
    {
        ThisSum = 0;
        for ( j = i; j < N; j++)
        {
            ThisSum += A[j];
            if (ThisSum > MaxSum)
            {
                MaxSum = ThisSum;
            }
        }
    }
    return MaxSum;
}

int MaxSubseqSum3( int A[], int N )
{
    return DivideAndConquer( A, 0, N-1);
}

int DivideAndConquer( int List[], int left, int right )
{
     /* 分治法求List[left]到List[right]的最大子列和 */ 
    int MaxLeftSum, MaxRightSum;  /* 存放左右子问题的解 */
    int MaxLeftBorderSum, MaxRightBorderSum;   /*存放跨分界线的结果*/ 

    int LeftBorderSum, RightBorderSum;
    int center, i;

    if( left == right ) { /* 递归的终止条件，子列只有1个数字 */
        if( List[left] > 0) return List[left];
        else return 0;
    }

       /* 下面是"分"的过程 */ 
    center = ( left + right ) / 2;  /* 找到中分点 */ 
    MaxLeftSum = DivideAndConquer( List, left, center );  /* 递归求得两边子列的最大和 */
    MaxRightSum = DivideAndConquer( List, center+1, right );

      /* 下面求跨分界线的最大子列和 */
    MaxLeftBorderSum = 0; LeftBorderSum = 0;
    for( i = center; i>= left; i-- ) {  /* 从中线向左扫描 */   
        LeftBorderSum += List[i];
        if( LeftBorderSum > MaxLeftBorderSum ) {
            MaxLeftBorderSum = LeftBorderSum;
        }
    }

    MaxRightBorderSum = 0; RightBorderSum = 0;
    for( i = center+1; i<= right; i++ ) { /* 从中线向右扫描 */  
        RightBorderSum += List[i];
        if( RightBorderSum > MaxRightBorderSum ) {
            MaxRightBorderSum = RightBorderSum;
        }
    }
    return Max3( MaxLeftSum, MaxRightSum, MaxLeftBorderSum + MaxRightBorderSum);
}

int Max3( int A, int B, int C)
{
     /* 返回3个整数中的最大值 */
    return A > B ? (A > C ? A : C) : (B > C ? B : C);
}

int MaxSubseqSum4( int A[], int N )
{
    int ThisSum, MaxSum = 0;
    int i, j;
    for ( i = 0; i < N; i++)
    {
        ThisSum += A[i];
        if (ThisSum > MaxSum)
        {
            MaxSum = ThisSum;
        } else if ( ThisSum < 0 ){
            ThisSum = 0; //如果当前子列和为负;则不可能使后面的部分和增大,抛弃之
        }
    }
    return MaxSum;
}