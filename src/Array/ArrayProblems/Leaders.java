package Array.ArrayProblems;

public class Leaders {
	static void leader(int arr[], int n) {
		int max=arr[n-1];
		System.out.print(max +" ");
		for(int i=n-2; i>=0; i--) {
			if(max<arr[i]) {
				max=arr[i];
				System.out.print(max + " ");
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,10,4,3,6,5,2};
		int n=arr.length;
		leader(arr,n);

	}

}
