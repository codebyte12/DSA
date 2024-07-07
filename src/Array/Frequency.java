package Array;

public class Frequency {
	static void frequency(int arr[], int n) {
		int freq=1;
		for(int i=1; i<n; i++)
			if(arr[i]==arr[i-1]) {
				freq++;
			}
			else {
		System.out.println(arr[i-1] + " " + freq);
		freq=1;
			}
		System.out.println(arr[n-1] +" " + freq);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,10,10,20,20,30};
		int n=arr.length;
		frequency(arr,n);

	}

}
