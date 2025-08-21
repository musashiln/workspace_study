#include <stdio.h>
#include <stdlib.h>

typedef int ElementType;

// 链表节点结构定义
typedef struct LinkNode
{
    ElementType data;
    struct LinkNode *next;
} LinkNode;

// 链表结构定义（包含头节点）
typedef struct LinkedList
{
    LinkNode *head; // 头节点指针
    int length;
} LinkedList;

// 1.初始化链表
void InitList(LinkedList *list) {
    // 创建头节点
    list->head = (LinkNode *)malloc(sizeof(LinkNode));
    if(!list->head) {
        printf("内存分配失败\n");
        exit(1);
    }
    list->head->next = NULL;
    list->length = 0;
}

// 2.创建新节点
LinkNode* CreateNode(ElementType data) {
    LinkNode *newNode = (LinkNode *)malloc(sizeof(LinkNode));
    if(!newNode) {
        printf("内存分配失败\n");
        exit(1);
    }
    newNode->next = NULL;
    newNode->data = data;
    return newNode;
}


// 3.头插法插入节点
void InsertAtHead(LinkedList *list, ElementType data) {
    LinkNode *newNode = CreateNode(data);
    newNode->next = list->head->next;
    list->head->next = newNode;
    list->length++;
}

// 4.尾插法插入节点
void InsertAtTail(LinkedList *list, ElementType data) {
    LinkNode *newNode = CreateNode(data);
    LinkNode *current = list->head;
    while (current->next != NULL) 
    {
        current = current->next;
    }
    current->next = newNode;
    list->length++;
}

// 5.在指定位置插入节点
void InsertAtPosition(LinkedList *list, int pos, ElementType data) {
    if(pos < 1 || pos > list->length + 1) {
        printf("插入位置非法!\n");
        return;
    }
    LinkNode *newNode = CreateNode(data);
    LinkNode *current = list->head;

    // 移动到插入位置的前一个节点
    for (int i = 1; i < pos; i++)
    {
        current = current->next;
    }
    newNode->next = current->next;
    current->next = newNode;
    list->length++;
}

// 6.按位置删除节点
void DeleteAtPosition(LinkedList *list, int pos) {
    if(pos < 1 || pos > list->length) {
        printf("删除位置非法!\n");
        return;
    }
    LinkNode *temp = NULL;
    LinkNode *current = list->head;

    // 移动到插入位置的前一个节点
    for (int i = 1; i < pos; i++)
    {
        current = current->next;
    }
    temp = current->next;
    current->next = current->next->next;
    free(temp);
    list->length--;
}

// 7. 按值删除节点（删除第一个匹配的节点）
void DeleteByValue(LinkedList *list, ElementType value) {
    LinkNode *temp = NULL;
    LinkNode *current = list->head;

    // 移动到插入位置的前一个节点
    while (current->next != NULL)
    {
        if(current->next->data == value) {
            temp = current->next;
            current->next = temp->next;
            free(temp);
            list->length--;
            return;
        }
        current = current->next;
    }
    printf("未找到值为 %d 的节点\n", value);
}

// 8. 按位置查找节点

// 9. 按值查找节点

// 10. 获取链表长度

// 11.判断链表是否为空
int isEmpty(LinkedList *list) {
    return list->length == 0;
}

// 12.打印链表
void PrintList(LinkedList *list) {
    if(isEmpty(list)) {
        printf("链表为空\n");
        return;
    }
    printf("链表内容 [长度=%d]:\n", list->length);
    LinkNode *current = list->head->next;
    while (current!=NULL)
    {
        printf("%d -> ", current->data);
        current = current->next;
    }
    printf("null\n");
}

// 14.销毁链表
void DestroyList(LinkedList *list) {
    LinkNode *current = list->head;
    LinkNode *temp = NULL;
    while (current != NULL)
    {
        temp = current;
        current = current->next;
        free(temp);
    }
    list->head = NULL;
    list->length = 0;
}

int main() {

    LinkedList myList;

    //初始化测试
    InitList(&myList);
    printf("初始化后：");
    PrintList(&myList);

    //头插法测试
    InsertAtHead(&myList, 10);
    InsertAtHead(&myList, 20);
    InsertAtHead(&myList, 30);
    printf("头插法后：");
    PrintList(&myList);

    //尾插法测试
    InsertAtTail(&myList, 40);
    InsertAtTail(&myList, 50);
    printf("尾插法后：");
    PrintList(&myList);

    //指定位置插入测试
    InsertAtPosition(&myList, 3, 99);
    InsertAtPosition(&myList, 1, 100);
    printf("指定位置插入后: ");
    PrintList(&myList);

    // 按位置删除测试
    DeleteAtPosition(&myList, 1);
    DeleteAtPosition(&myList, 3);
    printf("按位置删除后: ");
    PrintList(&myList);

    // 按值删除测试
    DeleteByValue(&myList, 10);
    DeleteByValue(&myList, 99);
    printf("按值删除后: ");
    PrintList(&myList);

    //销毁链表测试
    DestroyList(&myList);
    printf("销毁链表后:");
    PrintList(&myList);

    return 0;
}
