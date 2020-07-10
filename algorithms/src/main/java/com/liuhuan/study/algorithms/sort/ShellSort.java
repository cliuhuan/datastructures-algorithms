package com.liuhuan.study.algorithms.sort;

import com.liuhuan.study.algorithms.util.Utils;

import java.util.Date;

/**
 * @author LiuHuan
 * @date 2020-07-08 15:58
 * @desc 希尔排序
 */
public class ShellSort {
    public static void main(String[] args) {
        // 创建要给80000个的随机的数组
        int[] arr = Utils.generateArray();

        System.out.println("排序前的时间是=" + Utils.formatDate(new Date()));

        //交换式
        //shellSort(arr);

        //移位方式
        shellSort2(arr);

        System.out.println("排序前的时间是=" + Utils.formatDate(new Date()));
    }

    /**
     * 希尔排序时， 对有序序列在插入时采用交换法
     * @param arr
     */
    private static void shellSort(int[] arr) {

        int temp = 0;
        int count = 0;
        // 使用循环处理
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                // 遍历各组中所有的元素(共gap组，每组有个元素), 步长gap
                for (int j = i - gap; j >= 0; j -= gap) {
                    // 如果当前元素大于加上步长后的那个元素，说明交换
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
        }

    }

    /**
     * 对交换式的希尔排序进行优化->移位法
     * @param arr
     */
    private static void shellSort2(int[] arr) {

        // 增量gap, 并逐步的缩小增量
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            // 从第gap个元素，逐个对其所在的组进行直接插入排序
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                if (arr[j] < arr[j - gap]) {
                    while (j - gap >= 0 && temp < arr[j - gap]) {
                        //移动
                        arr[j] = arr[j-gap];
                        j -= gap;
                    }
                    //当退出while后，就给temp找到插入的位置
                    arr[j] = temp;
                }

            }
        }
    }
}
