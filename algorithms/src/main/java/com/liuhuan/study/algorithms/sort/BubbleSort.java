package com.liuhuan.study.algorithms.sort;

import com.liuhuan.study.algorithms.util.Utils;

import java.util.Date;

/**
 * @author LiuHuan
 * @date 2020-07-08 15:29
 * @desc 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {

        //测试一下冒泡排序的速度O(n^2), 给80000个数据，测试
        //创建要给80000个的随机的数组
        int[] arr = Utils.generateArray();

        System.out.println("排序前的时间是=" + Utils.formatDate(new Date()));

        //测试冒泡排序
        bubbleSort(arr);

        System.out.println("排序后的时间是=" + Utils.formatDate(new Date()));

    }

    /**
     * 冒泡排序算法
     *
     * @param arr
     */
    private static void bubbleSort(int[] arr) {
        // 冒泡排序 的时间复杂度 O(n^2)

        // 临时变量
        int temp = 0;
        // 标识变量，表示是否进行过交换
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 如果前面的数比后面的数大，则交换
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            // 在一趟排序中，一次交换都没有发生过
            if (!flag) {
                break;
            } else {
                // 重置flag!!!, 进行下次判断
                flag = false;
            }
        }
    }

}
