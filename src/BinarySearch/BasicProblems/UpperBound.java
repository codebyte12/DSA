package BinarySearch.BasicProblems;

//The smallest index such that the number at that index > x i.e arr[element index]>x


public class UpperBound {
    public static int upperbound(int arr[], int x){
          int ans=arr.length;
          int low=0;
          int high=arr.length-1;
          while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }

          }
          return ans;
    }
public static void main(String[] args) {
    int arr[]={2,3,6,7,8,8,11,11,12};
    int x=6;
    System.out.println(upperbound(arr, x));
}
}
