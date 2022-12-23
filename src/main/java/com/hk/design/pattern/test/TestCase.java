package com.hk.design.pattern.test;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * @author : HK意境
 * @ClassName : TestCase
 * @date : 2022/12/23 16:38
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class TestCase {

    public static int quickSort(int[] arr) {

        // {1, 2, -2, 3, 5}
        assert arr.length > 0;

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            //
            int sum = 0;
            for (int j = i; j > 0; j--) {
                sum += arr[j];
                if(sum > max) {
                    max = sum;
                }
            }
        }

        return max;
    }


    public static int maxOfSum(int[] arr) {
        // 当前位置能够得到的最大值=Max(前一个最大值+当前值， 当前值, 前一个最大值)

        int[] res = new int[arr.length];
        res[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            res[i] = Math.max(Math.max(res[i - 1] + arr[i], arr[i]), res[i-1]);
        }

        OptionalInt max = Arrays.stream(res).max();
        return max.getAsInt();
    }


    public static void main(String[] args) {

        int res = maxOfSum(new int[]{1,2,0,-2,3,5,-1});
        System.out.println(res);
    }



}
