package Stack_Queue.example1;

/**
 * ClassName: stackTest
 * Package: Stack_Queue.example1
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/7 22:00
 * @Version 1.0
 */
public class stackTest {
    public static void main(String[] args) {
        System.out.println("=== 测试数组栈 ===");
        testArrayStack();

        System.out.println("\n=== 测试链表栈 ===");
        testLinkedStack();
    }

    private static void testArrayStack() {
        MyArrayStack<Integer> stack = new MyArrayStack<>(3);

        // 入栈测试
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);  // 触发扩容
        System.out.print("入栈后: ");
        stack.printStack();

        // 查看栈顶
        System.out.println("栈顶元素: " + stack.peek());

        // 出栈测试
        System.out.println("出栈: " + stack.pop());
        System.out.println("出栈: " + stack.pop());
        System.out.print("两次出栈后: ");
        stack.printStack();

        // 测试栈空情况
        System.out.println("栈是否为空: " + stack.isEmpty());
        stack.pop();
        stack.pop();
        System.out.println("清空后是否为空: " + stack.isEmpty());
    }

    private static void testLinkedStack() {
        MyLinkedStack<String> stack = new MyLinkedStack<>();

        // 入栈测试
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("JavaScript");
        System.out.print("入栈后: ");
        stack.printStack();

        // 查看栈顶
        System.out.println("栈顶元素: " + stack.peek());

        // 出栈测试
        System.out.println("出栈: " + stack.pop());
        System.out.print("出栈后: ");
        stack.printStack();

        // 包含测试
        System.out.println("是否包含 'Java': " + stack.contains("Java"));
        System.out.println("是否包含 'Ruby': " + stack.contains("Ruby"));

        // 清空测试
        stack.clear();
        System.out.println("清空后栈大小: " + stack.size());
    }
}