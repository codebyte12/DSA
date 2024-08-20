package Array.ArrayProblems;

public class Rotateleft {
	static void rotate(int arr[], int n) {
	int temp=arr[0];                  //store the first element into temp element
	for(int i=1; i<n; i++){             //traverse from the i=1 & move every element one place back
		arr[i-1]=arr[i];
	}
	arr[n-1]=temp;                      //place the temp element into the last position
}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		rotate(arr,n);
		for(int i=0; i<n; i++){                 //To print the updated array traverse the arr and print
			System.out.print(arr[i] + " ");
		}
		

	}

}
