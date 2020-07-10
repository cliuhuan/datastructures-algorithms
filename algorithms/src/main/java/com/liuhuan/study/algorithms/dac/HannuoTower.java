package com.liuhuan.study.algorithms.dac;

/**
 * @author LiuHuan
 * @date 2020-07-10 09:48
 * @desc 汉诺塔的移动的方法，使用分治算法
 */
public class HannuoTower {

    public static void main(String[] args) {
        hannuoTower(10, 'A', 'B', 'C');
    }

    public static void hannuoTower(int num, char a, char b, char c) {
        //如果只有一个盘
        if(num == 1) {
            System.out.println("第1个盘从 " + a + "->" + c);
        } else {
            //如果我们有 n >= 2 情况，我们总是可以看做是两个盘 1.最下边的一个盘 2. 上面的所有盘
            //1. 先把 最上面的所有盘 A->B， 移动过程会使用到 c
            hannuoTower(num - 1, a, c, b);
            //2. 把最下边的盘 A->C
            System.out.println("第" + num + "个盘从 " + a + "->" + c);
            //3. 把B塔的所有盘 从 B->C , 移动过程使用到 a塔
            hannuoTower(num - 1, b, a, c);
        }
    }

}
