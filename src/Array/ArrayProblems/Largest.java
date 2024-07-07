package Array.ArrayProblems;



public class Largest {
	
	//naive approach
	//static int largest(int arr[], int n) {
	//sorting the arr with arrays.sort fun
	//Arrays.sort(arr);
	//return arr[n-1];
	

	//}
	
//	Another approach
	
	static int largest(int arr[],int n) {
		//travesrse the whole arr
		//store the first element of array in a integer considering it as largest element
	int res=arr[0];
	for(int i=1; i<=n-1; i++)
		//after running the loop compare the element of res with arr[i] 
		//if arr[i]>res the res will be res=arr[i]
		if(arr[i]>res) {
			res=arr[i];
		
		}
	return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={5,20,10,15,6};
		int n=arr.length;
		System.out.println(largest(arr,n));

		}

}
