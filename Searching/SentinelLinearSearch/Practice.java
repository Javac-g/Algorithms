package Searching.SentinelLinearSearch;

public class Practice {
    public static void sentinel_search(int[] arr, int length, int Number){
        int last = arr[length-1]; // save last element
        arr[length-1] = Number; // add protection element as last
        int index = 0;

        while (arr[index] != Number) { //increase index , loop array until match
            index++;
        }
        arr[length - 1] = last;

        if (index < arr.length -1 || arr[length -1] == Number){
            System.out.println("Found element at index: " + index);
        }
        else {
            System.out.println("Element not found");
        }
    }
    public static void main(String...args){
        int[] arr = {2,7,3,1,9,3,2,8};
        sentinel_search(arr, arr.length, 8);
    }
}
