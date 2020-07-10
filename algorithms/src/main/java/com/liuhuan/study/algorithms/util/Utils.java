package com.liuhuan.study.algorithms.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author LiuHuan
 * @date 2020-07-08 15:39
 * @desc
 */
public class Utils {

    /**
     * 生成80000个的随机的数组
     */
    public static int[] generateArray(){
        int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            //生成一个[0, 8000000) 数
            arr[i] = (int)(Math.random() * 8000000);
        }
        return arr;
    }

    /**
     * 格式化时间
     * @param date
     * @return
     */
    public static String formatDate(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(date);
    }

}
