package BinarySearch.BasicProblems;

//upper bound logic 
public class SearchInsertPosition {

    public static int searchInsertPosition(int arr[], int target){
       int ans=arr.length;
       int low=0;
       int high=arr.length-1;
       while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]>=target){
            ans=mid;
            high=mid-1;
        }else{
            low=mid+1;
        }
       }
       return  ans;
    }
public static void main(String[] args) {
    int arr[]={1,3,5,6};
    int target=5;
    System.out.println(searchInsertPosition(arr, target));
}
}
