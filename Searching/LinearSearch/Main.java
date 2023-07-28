package Searching.LinearSearch;

public class Main {
    public static int search(int[] arr,int N, int x){
        for(int i = 0; i < N ;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String...args){
        int[] arr = {5,1,7,2,3,9,10};
        int x = 2;
        int result = search(arr,arr.length,x);
        if (result>=0){
            System.out.println("Index of " +  x + " is: " + result);
        }else {
            System.out.println("Not found");
        }
    }
}
