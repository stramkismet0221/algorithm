package com.stramkismet.practice.algorithm;

import java.util.Arrays;

/**
 * 排序算法
 * 相邻的数据进行比较，如果a[i]>a[i+1]则两数交换位置
 *
 * @author shangxi
 */
public class BubbleSort {

    public static void sort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            // len -i -1 :
            //-1是为了防止数组越界即当数组到了len-1时会去出len-1和len的数据
            //-i是为了减少比较次数,每遍循环完成后最大的数处于最后的位置，
            //因此不需要继续向后遍历
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
                System.out.println("当前i="+i+",当前j="+j+Arrays.toString(arr));
            }
        }
    }

    public static void main(String[] args) {
        int[] theArray = {10, 1, 18, 30, 23, 12, 7, 5, 18, 17};
        System.out.println(Arrays.toString(theArray));
        sort(theArray);
        System.out.println(Arrays.toString(theArray));
    }
}
