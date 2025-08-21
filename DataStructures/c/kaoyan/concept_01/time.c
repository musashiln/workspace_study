#include <stdio.h>
#include <time.h>

//clock():捕捉从程序开始运行到clock()被调用时所耗费的时间。这个
// 时间单位是clock tick,即“时钟打点”。
// 常数CLK_TCK:机器时钟每秒所走的时钟打点数。

clock_t start, stop;
double duration;

int MyFunction();
int main()
{
    start = clock();
    MyFunction();
    stop = clock();
    duration = ((double)(stop - start))/CLK_TCK;
}

int MyFunction()
{
    return 0;
}