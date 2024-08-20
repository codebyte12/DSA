package Array.ArrayProblems;



/*public class Largest {	
	static int largest(int arr[],int n) {      //Optimized Approach 
	int result=Integer.MIN_VALUE;    //Intilize the min value as the largest value 
	for(int i=0; i<n; i++)
		if(arr[i]>=result) {     //comapre largest with arr[i] if arr[i]>largest update the value of largest
			result=arr[i];
	    }
	return result;              // returning largest element
	}
*/

/*public class Largest{
	static int largest(int arr[], int n){
		Arrays.sort(arr);           //Brute force approach sort the array with built in function & return last value
		int result=arr[n-1];       //as after sorting largest element will be at last;
		return result;
	}     
		*/

public class Largest{
	static int largest(int arr[], int n){
		int result=Integer.MIN_VALUE;         //Initilize the min value as largest
		for(int i=0; i<n; i++){               // treverse the whole array
			result=Math.max(result,arr[i]);      // using built in function to get largest value update the result
		}
		return result;
	}
	public static void main(String[] args) {
		
		int arr[]={3,3,6,1};
		int n=arr.length;
		System.out.println(largest(arr,n));

       }
}
