package Array.ArrayProblems;


public class SecondLargest {
	static int secondlargest(int arr[], int n) {
		//brute force approach 
		//sort the array and return the n-2 
		//Arrays.sort(arr);
		//return arr[n-2];
	
	
	// the upper brute force approach will fail if the element of n-1 & n-2 will be same
	//another approch to solve this problem will be
	
	//sort the arr

        int largest = 0;
        int slargest = -1;
        
        // Find the largest element
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] > slargest && arr[i] != largest) {
                slargest = arr[i];
            }
        }
        
        return slargest;
    }
    
    public static void main(String[] args) {
        
        int arr[] = {10, 5, 8, 20};
        int n = arr.length;
        System.out.println(secondlargest(arr, n));
	}
}