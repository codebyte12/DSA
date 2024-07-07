package Array;

public class RemoveDuplicate {
	static int remove(int arr[], int n) {
		int res=1;   // store the first value of the arr 
		for(int i=1; i<n; i++) {    // traverse the whole arr
			if(arr[i]!=arr[res-1]) {   // compare the arr with the previous element of arr if same then neglect if != them res will be incremented
				res++;
				
			}
		}
		return res;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,30,30,30};
		int n=arr.length;
		System.out.print(remove(arr,n));

	}

}
