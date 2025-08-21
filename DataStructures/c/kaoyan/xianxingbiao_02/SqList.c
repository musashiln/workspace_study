#include <stdio.h>
#include <stdlib.h>

#define INIT_CAPACITY 5  //初始容量
#define GROWTH_FACTOR 2  //扩容倍数

typedef int ElemType;
typedef struct 
{
    ElemType *data;  //存储数据的数组指针
    int length;  //当前元素个数
    int capacity;  //当前分配的总容量
}SeqList;

//1.初始化顺序表
void InitList(SeqList *list) {
    list->data = (ElemType *)malloc(INIT_CAPACITY * sizeof(ElemType));
    if (!list->data) {
        printf("内存分配失败!\n");
        exit(1);
    }
    list->length=0;
    list->capacity = INIT_CAPACITY;
}

//2.销毁顺序表
void DestroyList(SeqList *list) {
    free(list->data);
    list->data = NULL;
    list->length = 0;
    list->capacity = 0;
}

//3.扩容函数
void ExpandList(SeqList *list) {
    int new_capacity = list->capacity * GROWTH_FACTOR;
    ElemType *new_data = (ElemType *)realloc(list->data, new_capacity * sizeof(ElemType));
    if(!new_data) {
        printf("内存分配失败!\n");
        exit(1);
    }
    list->data = new_data;
    list->capacity = new_capacity;
    printf("已扩容至 %d\n", new_capacity);
}

//4.插入元素
void ListInsert(SeqList *list, int pos, ElemType e) {
    
    if(pos < 1 || pos > list->length + 1) {
        printf("插入位置非法\n");
        return;
    }

    //检查是否需要扩容
    if(list->length == list->capacity) {
        ExpandList(list);
    }

    for (int i = list->length; i >= pos; i--) {
        list->data[i] = list->data[i-1]; 
    }
    list->data[pos-1] = e;
    list->length++;
}

//5.删除元素
void ListDelete(SeqList *list, int pos) {
    if(list->length == 0) {
        printf("顺序表为空\n");
        return;
    }
    if(pos < 1 || pos > list->length) {
        printf("删除位置非法\n");
        return;
    }
    for (int i = pos; i < list->length; i++)
    {
        list->data[i-1] = list->data[i];
    }
    list->length--;
}

//6.按位置查找
int GetElem(SeqList *list, int pos) {
    if(pos < 1 || pos > list->length) {
        printf("查找位置非法\n");
        return -1;
    }
    return list->data[pos-1];
}

//7.按值查找
int LocateElem(SeqList *list, ElemType e) {
    for (int i = 0; i < list->length; i++)
    {
        if(list->data[i] == e) {
            return i+1;
        }
    }
    return 0;
}

//8.获取长度
int ListLength(SeqList *list) {
    return list->length;
}

//9.打印顺序表
void PrintList(SeqList *list) {
    if(list->length == 0) {
        printf("顺序表为空\n");
        return;
    }

    printf("顺序表内容[长度=%d,容量=%d]:\n", list->length, list->capacity);
    for (int i = 0; i < list->length; i++)
    {
        printf("%d ", list->data[i]);
    }
    printf("\n");
}

int main() {
    SeqList myList;

    //初始化
    InitList(&myList);
    printf("初始化后:");
    PrintList(&myList);

    //插入元素
    ListInsert(&myList, 1, 10);
    ListInsert(&myList, 2, 20);
    ListInsert(&myList, 3, 30);
    ListInsert(&myList, 2, 15); // 在位置2插入
    printf("插入元素后:");
    PrintList(&myList);

    //扩容函数
    // ExpandList(&myList);
    // printf("扩容后:");
    // PrintList(&myList);
    for (int i = 0; i < 10; i++) {
        ListInsert(&myList, 1, i*100);
    }
    printf("多次插入后: ");
    PrintList(&myList);

    //按位查找
    printf("第3位是%d", GetElem(&myList,3));
    //按值查找
    printf("元素20的位置: %d\n", LocateElem(&myList, 20));

    //删除元素
    ListDelete(&myList, 3);
    ListDelete(&myList, 1);
    printf("删除元素后:");
    PrintList(&myList);

    // 销毁测试
    DestroyList(&myList);
    printf("销毁后: ");
    PrintList(&myList);

    return 0;

}

