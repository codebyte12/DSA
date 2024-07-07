package Array;

public class Rotatedplaces {
	static void rotate(int arr[], int d, int n) {
		int temp[]=new int[d];
		
		//storing the first d elements into temp
		for(int i=0; i<d; i++) {
			temp[i]=arr[i];
			
		}
		int i;
		//shifting the remaining elements to the beginning
		for(i=d; i<n; i++) {
			arr[i-d]=arr[i];
		}
		//copy the elements fron temp to end of array
		for(i=0; i<d; i++) {
			arr[n-d+i]=temp[i];
		}
	}
	static void printarr(int arr[], int n) {
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		int d=3;
		int n=arr.length;
		rotate(arr,d,n);
		printarr(arr,n);

	}

}
