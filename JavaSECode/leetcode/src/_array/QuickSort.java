package _array;

import java.util.Arrays;

/**
 * ClassName: QuickSort
 * Package: _array
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/12 14:38
 * @Version 1.0
 */
public class QuickSort {

    /**
     * 快速排序主方法
     */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // 分区操作，获取基准位置
            int pivotIndex = partition(arr, low, high);

            // 递归排序左半部分
            quickSort(arr, low, pivotIndex - 1);

            // 递归排序右半部分
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    /**
     * 分区方法（Lomuto分区方案）
     * 返回基准元素的正确位置索引
     */
    private static int partition(int[] arr, int low, int high) {
        // 选择最右边的元素作为基准
        int pivot = arr[high];

        // i 指向小于基准的区域的边界
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // 如果当前元素小于或等于基准
            if (arr[j] <= pivot) {
                i++;
                // 交换 arr[i] 和 arr[j]
                swap(arr, i, j);
            }
        }

        // 将基准放到正确位置
        swap(arr, i + 1, high);

        return i + 1; // 返回基准的最终位置
    }

    /**
     * 交换数组中的两个元素
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 快速排序的便捷调用方法
     */
    public static void quickSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    /**
     * 另一种分区方案（Hoare分区方案）
     * 使用两个指针从两端向中间扫描
     */
    private static int partitionHoare(int[] arr, int low, int high) {
        int pivot = arr[low]; // 选择第一个元素作为基准
        int i = low - 1;
        int j = high + 1;

        while (true) {
            // 从左向右找到第一个大于等于基准的元素
            do {
                i++;
            } while (arr[i] < pivot);

            // 从右向左找到第一个小于等于基准的元素
            do {
                j--;
            } while (arr[j] > pivot);

            // 如果指针相遇或交叉，返回j
            if (i >= j) {
                return j;
            }

            // 交换两个元素
            swap(arr, i, j);
        }
    }

    /**
     * 快速排序的优化版本：三数取中法选择基准
     */
    public static void quickSortOptimized(int[] arr, int low, int high) {
        if (low < high) {
            // 使用三数取中法选择基准
            int median = medianOfThree(arr, low, high);
            swap(arr, median, high); // 将中位数放到最右边

            int pivotIndex = partition(arr, low, high);
            quickSortOptimized(arr, low, pivotIndex - 1);
            quickSortOptimized(arr, pivotIndex + 1, high);
        }
    }

    /**
     * 返回左、中、右三个元素的中位数索引
     */
    private static int medianOfThree(int[] arr, int low, int high) {
        int mid = low + (high - low) / 2;

        if (arr[low] > arr[mid]) {
            swap(arr, low, mid);
        }
        if (arr[low] > arr[high]) {
            swap(arr, low, high);
        }
        if (arr[mid] > arr[high]) {
            swap(arr, mid, high);
        }

        return mid;
    }

    /**
     * 测试方法
     */
    public static void main(String[] args) {
        // 测试用例1
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("原始数组: " + Arrays.toString(arr1));

        quickSort(arr1);
        System.out.println("快速排序后: " + Arrays.toString(arr1));

        // 测试用例2
        int[] arr2 = {5, 1, 4, 2, 8, 0, 2};
        System.out.println("\n原始数组: " + Arrays.toString(arr2));

        quickSortOptimized(arr2, 0, arr2.length - 1);
        System.out.println("优化快速排序后: " + Arrays.toString(arr2));

        // 测试用例3：已排序数组
        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println("\n已排序数组: " + Arrays.toString(arr3));

        quickSort(arr3);
        System.out.println("快速排序后: " + Arrays.toString(arr3));
    }
}