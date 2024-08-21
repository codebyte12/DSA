package Array.Fundamentals;

/* public class Rotatedplaces {
	static void rotate(int arr[], int d, int n) {          //brute force approach
		if(d>n){
			d=d%n;                    //if size of d is greator than size of array then only the remainder will be rotated
		}
		int temp[]=new int[d];
		                //store the elements to be rotated into temp arr
		for(int i=0; i<d; i++){
			temp[i]=arr[i];
		}
		for(int i=d; i<n; i++){               //shift the remaining elements to d places back
			arr[i-d]=arr[i];
		}
		for(int i=n-d; i<n; i++){            //after shifting elements run the loop to put back temp array into array
			arr[i]=temp[i-(n-d)];
		}
	}
    //the TC of this is-
//for first loop - O(d)
//for second loop - O(n-d)
//for third loop - O(d)
//total TC is O(n+k);

//the space complexity used is O(d) i.e size of temp array 


	   */

	   public class Rotatedplaces{                 //this is more optimized approach 
		static void rotate(int arr[],int d, int n){
			if(d>n){
				d=d%n;
			}
                    reverse(arr, 0,d-1);            //rotating first four elements   TC - O(d)
					reverse(arr,d,n-1);                //rotating last two elements         TC- O(n-d)
					reverse(arr,0,n-1);           //rotating whole array              TC- O(n)
		}
	   static void reverse(int arr[], int first, int last){      //method to rotate the elements 
		while(first<last){
        int temp=arr[first];
		arr[first]=arr[last];                //TC= O(2n) although tc is increased in this method but sc is decreased
		arr[last]=temp;                      //SC = O(1) for temp 
		first++;                             //Sc of algorithm is O(n);
		last--;
		}
	   }

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int d=10;              //here size of d is larger than the size of array
		int n=arr.length;
		rotate(arr,d,n);
		for(int i=0; i<n; i++){                  //run a loop to print the updated array
			System.err.print(arr[i] + " ");
		}
	}
}

