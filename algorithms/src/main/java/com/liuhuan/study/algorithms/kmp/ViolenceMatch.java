package com.liuhuan.study.algorithms.kmp;

/**
 * @author LiuHuan
 * @date 2020-07-10 10:03
 * @desc 暴力匹配算法
 */
public class ViolenceMatch {

    public static void main(String[] args) {
        //测试暴力匹配算法
        String str1 = "你好 世界 世界 你好 你好 欢迎来到刘欢的世界";
        String str2 = "你好 欢迎";
        int index = violenceMatch(str1, str2);
        System.out.println("index=" + index);

    }

    /**
     * 暴力匹配算法实现
     * @param str1
     * @param str2
     * @return
     */
    private static int violenceMatch(String str1, String str2) {
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        int s1Len = s1.length;
        int s2Len = s2.length;

        // i索引指向s1
        int i = 0;
        // j索引指向s2
        int j = 0;
        // 保证匹配时，不越界
        while (i < s1Len && j < s2Len) {

            //匹配ok
            if(s1[i] == s2[j]) {
                i++;
                j++;
                //没有匹配成功
            } else {
                //如果失配（即str1[i]! = str2[j]），令i = i - (j - 1)，j = 0。
                i = i - (j - 1);
                j = 0;
            }
        }

        //判断是否匹配成功
        if(j == s2Len) {
            return i - j;
        } else {
            return -1;
        }
    }
}
