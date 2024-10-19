package BinarySearch.BasicProblems;


//Lower bound :- the smallest index such that num at that index should be >= x
public class LowerBound {
  public static int lowerbound(int arr[], int x){
           int ans=arr.length;
           int low=0;
           int high=arr.length-1;
           while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                 ans=mid;
                 high=mid-1;
            }else{
                low=mid+1;
            }
           
           }
           return ans;
   }

public static void main(String[] args) {
    // int arr[]={1,2,2,3};
    // int x=2;
    int arr[]={1,2,3,3,5,8,8,10,10,11};
    int x=8;
    System.out.println(lowerbound(arr,x));
}
}
