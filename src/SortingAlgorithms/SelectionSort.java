package SortingAlgorithms;

import java.util.Arrays;


//this algorithm works on the principal find the min element & swap with first position
//the time complexity for this algorithm is O(n^2) in best, avg & worst case;

public class SelectionSort {
    static int[] selectionSort(int arr[]){
    for(int i=0; i<arr.length; i++){
        int min=i;    //current element is selected as minimum

        for(int j=i; j<arr.length; j++){
            if(arr[j]<arr[min]){
                min=j;
            }
        }
        if(min!=i){
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    return arr;
    }
   public static void main(String[] args) {
       int arr[]={13,46,24,52,20,9};
       System.out.println(Arrays.toString(selectionSort(arr)));
   }
}
