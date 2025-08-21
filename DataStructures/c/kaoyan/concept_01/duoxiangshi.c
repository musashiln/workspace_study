#include <stdio.h>
#include <math.h>
#include <time.h>
clock_t start, stop;
double duration;
#define MAXN 10
#define MAXK 1e7
double f(int n, double a[], double x);
double f1(int n, double a[], double x);

//计算f(x)=∑i=0 9 i*x^i
int main()
{
    int i;
    double a[MAXN];
    for( i=0 ; i<MAXN; i++) a[i] = (double)i;

    start = clock();
    for( i=0 ; i<MAXK; i++)
        f(MAXN-1, a, 1.1);
    stop = clock();
    duration = ((double)(stop - start))/CLK_TCK/MAXK;
    printf("ticks1 = %f\n", (double)(stop - start));
    printf("duration1 = %6.2e\n", duration);

    start = clock();
    for( i=0 ; i<MAXK; i++)
        f1(MAXN-1, a, 1.1);
    stop = clock();
    duration = ((double)(stop - start))/CLK_TCK/MAXK;
    printf("ticks2 = %f\n", (double)(stop - start));
    printf("duration2 = %6.2e\n", duration);

    double b[101];
    b[0] = 1;
    for( i=1 ; i<101; i++) b[i] = (double)1/i;

    start = clock();
    for( i=0 ; i<MAXK; i++)
        f(100, b, 1.1);
    stop = clock();
    duration = ((double)(stop - start))/CLK_TCK/MAXK;
    printf("ticks3 = %f\n", (double)(stop - start));
    printf("duration3 = %6.2e\n", duration);
    printf("%f\n", f(100, b, 1.1));

    start = clock();
    for( i=0 ; i<MAXK; i++)
        f1(100, b, 1.1);
    stop = clock();
    duration = ((double)(stop - start))/CLK_TCK/MAXK;
    printf("ticks4 = %f\n", (double)(stop - start));
    printf("duration4 = %6.2e\n", duration);
    printf("%f\n", f1(100, b, 1.1));
    
    return 0;
}

//f(x)=a0+a1*x+a2*x^2+..+an*x^n  
double f(int n, double a[], double x)
{
    double p = a[0];
    int i;
    for( i=1; i<=n; i++)
    {
        p += (a[i] * pow(x, i));
    }
    return p;
}

//f(x)=a0+x(a1+x(..(an-1+x*an)))
double f1(int n, double a[], double x)
{
    double p = a[n];
    int i;
    for( i=n; i>0; i--)
    {
        p = x * p + a[i-1];
    }
    return p;
}





