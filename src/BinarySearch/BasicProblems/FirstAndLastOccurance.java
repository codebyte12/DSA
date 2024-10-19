package BinarySearch.BasicProblems;

import java.util.Arrays;

public class FirstAndLastOccurance {
    public static int[] firstAndlast(int arr[], int target){
         int First=first(arr, target);
         if(First==-1){
            return new int[]{-1,-1};
         }
         int Last=last(arr, target);
         return new int[]{First,Last};
    }
public static int first(int arr[], int target){
    int ans=-1;
    int low=0;
    int high=arr.length-1;
    while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]==target){
            ans=mid;
            high=mid-1;
        }else if(arr[mid]>target){
            high=mid-1;
        }else{
            low=mid+1;
        }
    }
    return ans;
}

public static int last(int arr[], int target){
    int ans=-1;
    int low=0;
    int high=arr.length-1;
    while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]==target){
            ans=mid;
            low=mid+1;
        }else if(arr[mid]<target){
            low=mid+1;
        }else{
            high=mid-1;
        }
    }
    return ans;
}
    public static void main(String[] args) {
        int arr[]={5,7,7,8,8,10};
        int target=8;
        System.out.println(Arrays.toString(firstAndlast(arr, target)));   //Arrays.String is used to convert arrays into String otherwise java will print memory address
    }

}
