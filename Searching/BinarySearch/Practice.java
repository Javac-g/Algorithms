package Searching.BinarySearch;

import java.util.Arrays;

public class Practice {
    public static int  binary_search(int[] arr,int x){
        int left = 0,right = arr.length -1;
        while (left<=right){
            int middle = left + (right - left) / 2;
            if (arr[middle] == x){
                return middle;
            }
            if (arr[middle] < x){
                left = middle+1;
            }else{
                right = middle  -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,9,3,5,1,7,4,6};
        Arrays.sort(arr);
        int x = 7;
        int result = binary_search(arr,x);
        if (result == -1){
            System.out.println("Element not found");

        }else {
            System.out.println("Found at index: " + result);
        }
    }
}
