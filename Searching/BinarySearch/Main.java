package Searching.BinarySearch;

import java.util.Arrays;

public class Main {
    public static  int recursiveBinarySearch(int[] arr,int left , int right , int x){
        if (right >= left){
            int mid = left + (right - left) / 2;

            if (arr[mid] == x){
                return mid;
            }
            if (arr[mid] > x){
                return recursiveBinarySearch(arr,left,mid - 1,x);
            }
            return recursiveBinarySearch(arr,mid  + 1,right,x);
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int x){

        int left = 0 , right = arr.length-1;
        while(left <= right){
            int middle = left + (right - left) / 2;
            if (arr[middle] == x){
                return middle;
            }
            if (arr[middle] < x){
                left = middle + 1;
            }
            else {
                right = middle - 1;
            }
        }
        return  -1;
    }
    public static void main(String...args){
        int[] arr = {2,3,4,10,40};
        int n = arr.length;
        int x = 10;
        int result = binarySearch(arr,x);
        if (result == -1){
            System.out.println("Elements not found");
        }else {
            System.out.println(x + " is present at index: " + result);
        }
    }
}
