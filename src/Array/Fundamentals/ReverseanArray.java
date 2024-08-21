package Array.Fundamentals;

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
	
	public static void main(String[] args) {
		int arr[]= {10,5,7,30};
		int n=arr.length;
		reverse(arr,4);
		for(int i=0; i<n; i++){
         System.out.print(arr[i] + " ");
		}
	}
}
