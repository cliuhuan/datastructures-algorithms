package com.liuhuan.study.algorithms.sort;

import com.liuhuan.study.algorithms.util.Utils;

import java.util.Date;

/**
 * @author LiuHuan
 * @date 2020-07-08 15:53
 * @desc 插入排序
 */
public class InsertSort {

    public static void main(String[] args) {
        // 创建要给80000个的随机的数组
        int[] arr = Utils.generateArray();

        System.out.println("排序前的时间是=" + Utils.formatDate(new Date()));

        //调用插入排序算法
        insertSort(arr);

        System.out.println("排序前的时间是=" + Utils.formatDate(new Date()));

    }

    /**
     * 插入排序
     *
     * @param arr
     */
    private static void insertSort(int[] arr) {
        int insertVal = 0;
        int insertIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            //定义待插入的数
            insertVal = arr[i];
            // 即arr[1]的前面这个数的下标
            insertIndex = i - 1;

            /**
             * 给insertVal 找到插入的位置
             *              说明
             *              1. insertIndex >= 0 保证在给insertVal 找插入位置，不越界
             *              2. insertVal < arr[insertIndex] 待插入的数，还没有找到插入位置
             *              3. 就需要将 arr[insertIndex] 后移
             */
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            // 当退出while循环时，说明插入的位置找到, insertIndex + 1

            //这里我们判断是否需要赋值
            if (insertIndex + 1 != i) {
                arr[insertIndex + 1] = insertVal;
            }
        }

    }

}
