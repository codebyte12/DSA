package Array.MediumProblems;

/*Max Subarray Sum of contiguous array */
/*if an arr is give for length 0 to n
 * 
 * the first subarray lie between 1-1
 * second subarray lie between 1-2
 * & so on
 */


/*Brute force */
/*tc - O(n^3)
 * sc - O(1);
 */

 /* 
public class MaxSubarraySum {
     public static int maxSubSum(int arr[], int n){

        int maxSum=Integer.MIN_VALUE;           //initialize max sum as lowest value
           for(int i=0; i<n; i++){              //traversing whole arr

            for(int j=i; j<n; j++){            //traversing from i to n : this means that the max subarray will lie between i & j
                int sum=0;
                for(int k=i;k<j; k++){        //running another loop to compute the sum one by one from i to j
                    sum +=arr[k];
                }
                maxSum=Math.max(maxSum,sum);     //updating max sum
            }
           }
           return maxSum;
     }
    public static void main(String [] args){
       int arr[]={2, 3, 5, -2, 7, -4};
       int n=arr.length;
       System.out.print(maxSubSum(arr, n));
    }
}

*/



/*better Approach */
/*Instead of taking another loop for computing sum when j moves the sum can be computed */

/*tc-O(n^2) 
 * sc- O(1)
*/

/* 
public class MaxSubarraySum {
    public static int maxSubSum(int arr[], int n){

       int maxSum=Integer.MIN_VALUE;           //initialize max sum as lowest value
          for(int i=0; i<n; i++){              //traversing whole arr
            int sum=0;
           for(int j=i; j<n; j++){            //traversing from i to n & computing the sum 
        
             sum +=arr[j];
           
           maxSum=Math.max(maxSum,sum);        //updating sum
           }
          }
          return maxSum;
    }
   public static void main(String [] args){
      int arr[]={2, 3, 5, -2, 7, -4};
      int n=arr.length;
      System.out.print(maxSubSum(arr, n));
   }
}
*/



/*Optimal Approach - KADANE'S ALGORITHM 
 * this algorithm states that take the max sum as lowest & sum as 0
 * 
 * traverse the arr & compute the sum
 * if the sum becomes -ve then update the sum as 0 as for max -ve sum will always decrease the max value
 * 
 * tc - O(n)
 * sc - O(1)
*/


public class MaxSubarraySum {
    public static int maxSubSum(int arr[], int n){

       int maxSum=Integer.MIN_VALUE;           //initialize max sum as lowest value
       int sum=0;                              //initialize sum as 0
          for(int i=0; i<n; i++){              //traversing whole arr
             sum +=arr[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }
           maxSum=Math.max(maxSum,sum);        //updating sum
        }
          return maxSum;
    }
   public static void main(String [] args){
      int arr[]={2, 3, 5, -2, 7, -4};
      int n=arr.length;
      System.out.print(maxSubSum(arr, n));
   }
}
