package Array.ArrayProblems;

public class Stock {
	static int stock(int arr[], int n) {
		int profit=0;
		for(int i=1; i<n; i++) {
			if(arr[i]>arr[i-1])
				profit+=arr[i]+(arr[i]-arr[i-1]);
		}
		return profit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,3,8,12};
		int n=arr.length;
		System.out.print(stock(arr,n));


	

	}

}
