#include <stdio.h>
#include <stdbool.h>
#define MaxSize 50

/**
 * 静态顺序表
 */

typedef int ElementType;
typedef struct
{
    ElementType data[MaxSize];
    int length;
} SeqList;

bool IsEmpty(SeqList *list);

//1.初始化顺序表
void InitList(SeqList *list) {
    list->length = 0;
} 

//2.插入元素
bool ListInsert(SeqList *list,int pos,ElementType e){ //在顺序表的第pos(1<=i<=L.length+1)个位置插入新元素e
    //检查顺序表是否已满
    if(list->length >= MaxSize) {
        printf("顺序表已满，无法插入\n");
        return false;
    }

    //检查位置合法性
    if(pos < 1 || pos > list->length + 1) {
        printf("插入位置非法!\n");
    }

    //移动元素（从后向前移动）
    for(int i = list->length; i >= pos; i--) {
        list->data[i] = list->data[i-1];
    }
    //插入新元素
    list->data[pos-1] = e;
    list->length++;
    return true;
}  

//3.删除元素
bool ListDelete(SeqList *list,int pos) {
    if(IsEmpty(list)) {
        printf("顺序表为空\n");
        return false;
    }
    
    //检查位置非法性
    if (pos < 1 || pos > list->length)
    {
        printf("删除位置非法!\n");
        return false;
    }
    
    //移动元素覆盖删除位置
    for (int i = pos; i < list->length; i++)
    {
        list->data[i-1] = list->data[i];
    }
    list->length--;
    return true;
}

//4.按位置查找
ElementType GetElem(SeqList *list, int pos) {
    if(pos < 1 || pos > list->length) {
        printf("查找位置非法!");
        return -1;
    }
    return list->data[pos-1];
}

//5.按值查找
int LocateElem(SeqList *list, ElementType elem) {
    for (int i = 0; i < list->length; i++)
    {
        if (list->data[i] == elem) {
            return i+1;
        }
    }
    return 0;
}

//6.获取长度
int ListLength(SeqList *list) {
    return list->length;
}

//7.判断是否为空
bool IsEmpty(SeqList *list) {
    return list->length == 0;
}

//8.清空顺序表
void ClearList(SeqList *list) {
    list->length = 0;
}

//9.打印顺序表
void PrintList(SeqList *list) {
    if(IsEmpty(list)) {
        printf("顺序表为空\n");
        return;
    }
    printf("顺序表内容[长度=%d/%d]:\n", list->length, MaxSize);
    for (int i = 0; i < list->length; i++)
    {
        printf("%d ", list->data[i]);
    }
    printf("\n");
}



int main(){
    SeqList myList;

    //初始化
    InitList(&myList);
    printf("初始化后:");
    PrintList(&myList);

    //插入
    ListInsert(&myList, 1, 10);
    ListInsert(&myList, 2, 20);
    ListInsert(&myList, 3, 30);
    ListInsert(&myList, 2, 15);
    printf("插入后:");
    PrintList(&myList);

    //查找
    printf("位置3的元素：%d\n", GetElem(&myList, 3));
    printf("元素20的元素：%d\n", LocateElem(&myList, 20));
    
    //删除
    ListDelete(&myList, 3);
    ListDelete(&myList, 1);
    printf("删除后:");
    PrintList(&myList);

    //清空
    ClearList(&myList);
    printf("清空后:");
    PrintList(&myList);

    //边界测试
    for (int i = 1; i <= MaxSize + 5; i++) {
        if (!ListInsert(&myList, i, i * 10)) {
            break;
        }
    }
    printf("边界测试后:");
    PrintList(&myList);
    
    return 0;
}






