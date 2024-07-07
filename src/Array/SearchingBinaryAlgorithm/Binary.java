package Array.SearchingBinaryAlgorithm;

public class Binary {
	static int searchbinary(int arr[], int x,int n){
		int low=0;
		int high=n-1;
		while(low<=high){
			int mid=(low+(high-low))/2;
			if(arr[mid]==x){
			return mid;
			}
			else if(arr[mid]<x){
			low=mid+1;
			}
			else
			high=mid-1;
		
		}
		return -1;

	}

	public static void main(String[] args) {
	    int arr[]={10, 20,30,40,50,60};
		int n=arr.length;
		int x=20;
		System.out.println(searchbinary(arr, x,n));


	}

}



//Given a arr[]={10, 20,30,40,50,60}
//x=20
//o/p=1    index of x
//have to find the index of x