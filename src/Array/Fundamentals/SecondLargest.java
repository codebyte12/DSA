package Array.Fundamentals;


/*public class SecondLargest {
	static int secondlargest(int arr[], int n) {
	         Arrays.sort(arr);          //sorts the array throgh built in function
             int largest=arr[n-1];       //after sorting store the largest element as arr[n-1]
             int slargest=-1;            //initilize secondlargest as -1 worst case if duplicates are present
             for(int i=n-2; i>=0; i--){   //traverse the array from backwards i.e i=n-2 and compare with largest
                if(arr[i]<largest){
                    slargest=arr[i];       //if arr[i]<largest update slargest & break the loop
                    break;
                }                               //TC of this is O(nlogn) for sorting & O(n) for single traversal 
                                                // TC is O(nlogn)
             }
             return slargest;
       
        }          
             */

             class SecondLargest{
                static int secondlargest(int arr[], int n){   //This is more optimized approach
                    int largest=arr[0];                        //store the first element as largest 
                    int slargest=-1;                       //initize slargest as -1
                 for(int i=1; i<n; i++){                 //traverse the whole arr
                    if(arr[i]>largest){                 //compare largest with arr[i] & if arr[i] is larger than largest
                        slargest=largest;                // update the slargest as largest
                        largest=arr[i];                 //& largest as arr[i] 
                    }
                    if(arr[i]>slargest && arr[i]<largest){            //suppose there is element which is smaller than largest
                        slargest=arr[i];                            //but greator than second largest than update that element as slargest
                    }
                 }
                 return slargest;                    //TC of this approch is O(n) as single traversal
        }
        public static void main(String[] args) {
       int arr[] = {10, 5, 8, 20};
      //  int arr[]={10,10,10,10,10};
        int n = arr.length;
        System.out.println(secondlargest(arr, n));
	}
}