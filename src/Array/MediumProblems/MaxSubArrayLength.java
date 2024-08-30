package Array.MediumProblems;


/*this question is part of the kadane's algorith the interviewer may ask what is the length of the max subarr sum elements */
/*the intuition behind this is that when ever we compute sum the sum always starts with 0 
 * 
 * so the the starting point of length will always where sum=0;
 * & the ending point is where sum is max i.e i;
 */


public class MaxSubArrayLength {
    public static int maxSubArrayLength(int arr[], int n){
        int maxSum=Integer.MIN_VALUE;       //initialize sum as min acc to kadane's algorithm
        int sum=0;                          //initilize sum as 0
        int start=0;
        int ansStart=0;                     //the starting point of max sum
        int ansEnd=0;                       //ending point of max sum

        for(int i=0; i<n; i++){
            if(sum==0){                  //if the sum==0 it is always the starting index of max subarray sum
                start=i;                //initialize i to start as sum=0
            }
            sum=sum+arr[i];
            if(sum>maxSum){
                maxSum=sum;
                ansStart=start;        //when max sum is computed the start point is ans of starting index
                ansEnd=i;              //the point where sum is max is ending index
            }
            if(sum<0){
                sum=0;
            }
        }
        return ansEnd-ansStart+1;      //+1 due to index starting from 0;
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int n=arr.length;
        System.err.print(maxSubArrayLength(arr, n));
    }

}
