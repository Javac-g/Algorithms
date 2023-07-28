package Searching.SentinelLinearSearch;

public class Main {
    public static void print(int[] arr){
        for (int x: arr){
            System.out.print( x + " ");
        }
        System.out.println();
    }
    public static  void sentinelSearch(int[] arr,int N, int X){
        int last = arr[N - 1];
        arr[N - 1] = X;
        int i = 0 ;
        while (arr[i] != X){
            i++;
            print(arr);
        }
        arr[N - 1] = last;
        print(arr);
        if ((i < N - 1) || (arr[N - 1] == X)){
            System.out.println(X + " is present at index: " + i);
        }else {
            System.out.println("Element not found");
        }

    }
    public static void main(String...args){
        int[] arr = {10,20,30,40,50,70,80,90,100};
        int N = arr.length;
        int X = 100;
        sentinelSearch(arr,N,X);
    }
}
