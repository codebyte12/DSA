package Array.ArrayProblems;

public class Leaders {
	static int leader(int arr[], int n) {
		int res=0;
		for(int i=0; i<=n; i++)
		if(arr[i]>arr[i+1]){
		res=arr[i];
		}
		return res;
		//int max=arr[n-1];
		//System.out.print(max +" ");
		//for(int i=n-2; i>=0; i--) {
			//if(max<arr[i]) {
			//	max=arr[i];
			//	System.out.print(max + " ");
			//}
		//}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,10,4,3,6,5,2};
		int n=arr.length;
		System.out.print(leader(arr,n));

	}

}
