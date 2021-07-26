package com;

import java.util.Arrays;

/**
 * ClassName:TextDemo9
 * Package:com
 * Description:
 *
 * @Author:HP
 * @date:2021/7/26 14:20
 */
public class TextDemo9 {
//    //单例模式
//    static class SingleTon{
//        public SingleTon() {
//
//        }
//        public static final SingleTon singleton = new SingleTon();
//        public static SingleTon getInstance() {
//            return singleton;
//        }
//    }
//
//    //饿汉方式
//    static class Singleton {
//        public Singleton() {}
//        public static Singleton singleTon = null;
//        public static Singleton getInstance() {
//            if(singleTon == null) {
//                synchronized (Singleton.class) {
//                    if(singleTon == null) {
//                        singleTon = new Singleton();
//                    }
//                }
//            }
//            return singleTon;
//        }
//    }

    //快速排序
//    public static void quickSort(int[] arr,int left,int right) {
//        if(left < right) {
//            int piv = pivot(arr,left,right);
//            quickSort(arr,left,piv - 1);
//            quickSort(arr,piv + 1,right);
//        }
//    }
//    public static int pivot(int[] arr,int left,int right) {
//        int tmp = arr[left];
//        while(left < right) {
//            while(left < right && arr[right] > tmp) right--;
//            arr[left] = arr[right];
//            while(left < right && arr[left] < tmp) left++;
//            arr[right] = arr[left];
//        }
//        arr[left] = tmp;
//        return left;
//    }
    //归并排序
//    public static void mergerSort(int[] arr,int left,int right) {
//        if(left >= right) return;
//        int mid = (left + right) / 2;
//        mergerSort(arr,left,mid);
//        mergerSort(arr,mid + 1,right);
//
//        merger(arr,left,mid,right);
//    }
//    public static void merger(int[] arr,int left,int mid,int right) {
//        int s1 = left;
//        int s2 = mid  +1;
//        int[] newArr = new int[right - left + 1];
//        int k = 0;
//        while(s1 <= mid && s2 <= right) {
//            if(arr[s1] < arr[s2]) {
//                newArr[k++] = arr[s1++];
//            } else {
//                newArr[k++] = arr[s2++];
//            }
//        }
//        while(s1 <= mid) newArr[k++] = arr[s1++];
//        while(s2 <= right) newArr[k++] = arr[s2++];
//        for (int i = 0; i < newArr.length; i++) {
//            arr[i + left] = newArr[i];
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = new int[]{2,5,7,1,6,9,3,0,10};
//        mergerSort(arr,0,arr.length - 1);
//        System.out.println(Arrays.toString(arr));
//    }
}
