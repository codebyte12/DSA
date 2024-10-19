package BinarySearch.BasicProblems;

// Search for elment in an arr if found return its index
public class BinaryAlgorithm {
    public static int binaryAlgorithm(int arr[], int x){
        int n=arr.length;
       int low=0;             //low pointer
       int high=n-1;          // high pointer
       while(low<=high){
        int mid=(low+high)/2;       //mid
        if(arr[mid]==x){
            return mid;
        }else if(arr[mid]>x){
            high=mid-1;
        }else{
            low=mid+1;
        }
       }
       return -1;
    }

    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8};
        int x=4;
        System.out.print(binaryAlgorithm(arr,x));

    }
}
