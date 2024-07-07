package Array;

public class ZeroestoEnd {
	static void zeroes(int arr[], int n) {
		int count =0;
		for(int i=0; i<n; i++)
			if(arr[i]!=0) {
				swap(arr,i,count);
				count++;
			}
	}

static void swap(int arr[],int i, int j) {
	int temp;
	temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	
}
static void printarr(int arr[], int n) {
	for(int i=0; i<n; i++) {
		System.out.print(arr[i] + " ");
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,5,0,10,0,9};
		int n= arr.length;
		zeroes(arr,n);
		printarr(arr,n);

	}

}
