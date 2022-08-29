package com.marcusbiel.javacourse.lesson2;

public class MainClass {
    public static void main(String[] args) {
        final int[] arr = {1,2,3,4};
        int[] arr2 = arr;
        arr2[1] = 8;
        arr2[2] = 9;
        for (int num:arr) {
            System.out.println(num);
        }
        //System.out.println(arr[1]);
    }
}
