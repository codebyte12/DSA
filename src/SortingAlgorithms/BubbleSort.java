package SortingAlgorithms;

//comparison based algorithms

import java.util.Arrays;

//swaps two num
//tc  for best case will be O(n)  & for avg & worst case will be O(n^2);
public class BubbleSort {
    static int[] bubbleSort(int arr[]){
    //for the complexity to be O(n) initialize a swap variable 

        for(int i=0; i<arr.length; i++){
            int swap=0;   //lets suppose array is ssorted & no swapping will take place
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    //swap arr, j, j+1
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=1;   //if swapping does take place update the swap variable
                }
            }
            if(swap==0){
                break;    //if swapping does not takes place move out of the outer loop
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={2,10,8,7};
        System.out.println(Arrays.toString(bubbleSort(arr)));

    }
}
