package Array.ArrayProblems;

public class ReverseanArray {
	static void reverse(int arr[],int n) {
		int temp;
		int first=0;
		int last=n-1;
		while(first<last) {
			temp=arr[first];
			arr[first]=arr[last];
			arr[last]=temp;
					first++;
			last--;
		}
		
	}
	static void printArray(int arr[], int n) {
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,5,7,30};
		reverse(arr,4);
		printArray(arr,4);

	}

}
