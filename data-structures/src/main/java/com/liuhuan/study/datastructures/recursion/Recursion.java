package com.liuhuan.study.datastructures.recursion;

/**
 * @author LiuHuan
 * @date 2020-07-03 15:58
 * @desc 递归
 */
public class Recursion {

    public static void main(String[] args) {
        print(4);

        int res = factorial(3);
        System.out.println("res=" + res);
    }

    /**
     * 打印问题
     * @param n
     */
    public static void print(int n) {
        if (n > 2) {
            print(n - 1);
        }
        System.out.println("n=" + n);
    }

    /**
     * 阶乘问题
     * @param n
     * @return
     */
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }

}
