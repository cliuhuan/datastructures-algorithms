package com.liuhuan.study.algorithms.sort;

import com.liuhuan.study.algorithms.util.Utils;

import java.util.Date;

/**
 * @author LiuHuan
 * @date 2020-07-08 15:36
 * @desc 选择排序
 */
public class SelectSort {

    public static void main(String[] args) {
        //创建80000个的随机的数组
        int[] arr = Utils.generateArray();

        System.out.println("排序前的时间是=" + Utils.formatDate(new Date()));

        selectSort(arr);

        System.out.println("排序前的时间是=" + Utils.formatDate(new Date()));

    }

    /**
     * 选择排序
     * @param arr
     */
    private static void selectSort(int[] arr) {
        //选择排序时间复杂度是 O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                // 说明假定的最小值，并不是最小
                if (min > arr[j]) {
                    // 重置min
                    min = arr[j];
                    // 重置minIndex
                    minIndex = j;
                }
            }
            // 将最小值，放在arr[0], 即交换
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }
}
