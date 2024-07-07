package Array.Searching;

public class Unsorted {
	static int search(int arr[], int x, int n) {
	for(int i=n-1; i<=0; i++) 
		if(arr[i]==x) {
			return i;
		}
	return -1;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {20,5,6,8,30,50};
		int x=6;
		int n=arr.length;
		System.out.println(search(arr,x,n));

	}

}
