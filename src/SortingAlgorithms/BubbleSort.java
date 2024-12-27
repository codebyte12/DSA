package SortingAlgorithms;

//comparison based algorithms

import java.util.Arrays;

//swaps two num
//tc  for best case will be O(n)  & for avg & worst case will be O(n^2);
public class BubbleSort {
    static int[] bubbleSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    //swap arr, j, j+1
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={2,10,8,7};
        System.out.println(Arrays.toString(bubbleSort(arr)));

    }
}
