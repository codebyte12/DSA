package Array.MediumProblems;

import java.util.Arrays;

/*this problem is two of two types
 * 1) sum will be given & have to return true or false based on sum present or not
 * 2)sum will be given & has to return the index of the elements
 */

 /*brute force approach 
  * fixing first element & running the second loop for rest of the array

  Tc-O(n^2)
  Sc- O(1);

  */     
  /* 
public class TwoSum {
    public static int[] twoSum(int arr[], int n, int target){
               for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    if(arr[i]+arr[j]==target){
                        //return true;                 //if asked sum is present or not
                        return new int[]{i,j};
                    }
                }
               }
               //return false;
               return new int[]{-1,1};             //if asked sum is present or not
    }
    public static void main(String[] args) {
        int arr[]={1, 6, 2, 10, 3};
        int target=11;
        int n=arr.length;
        System.out.print(Arrays.toString(twoSum(arr, n, target)));
    }
}   
    */




/*better Approach - we will search for the target - arr[i] element in the hashmap & return if found
 * HashMap- Store the elements  
 * tc- O(n) - in case of unordered map 
 *   - O(n^2)- worst case in unordered map
 * 
 * tc - O(nlogn) - ordered map such LinkedHashmap
 * 
 * sc - O(n) - hashmap has to store all the element
*/

/* 
public class TwoSum {
  //  public static int[] twoSum(int arr[], int n, int target){   
    public static boolean twoSum(int arr[], int n, int target){
        HashMap<Integer, Integer>ans = new HashMap<>();      // create a hashmap to store the element & index
        
        for(int i=0; i<n; i++){           //traverse the arr
            int num=target-arr[i];          
            if(ans.containsKey(num)){        //check if element is present in the hashmap/not
              //  return new int[]{ans.get(num),i};
              return true;
            }
            ans.put(arr[i], i);             //if element is not present than add it to hashmap
        }
          // return new int[]{-1,-1};   
          return false;
    }
    public static void main(String[] args) {
        int arr[]={1, 6, 2, 10, 3};
        int target=11;
        int n=arr.length;
        System.out.print((twoSum(arr, n, target)));
    }
}

*/

/*Optimal Approach -Two Pointer Approach 
                   - this approach is optimal only for boolean value 
 *                 - if index is asked to return throgh this approach than it will take some extra space to store the 
 *                    original index of element after sorting
 * 
 * TC - O(n) 
 * SC - O(1)
 */

public class TwoSum{

public static boolean twoSum(int arr[], int n, int target){
    int i=0; int j=n-1;
    Arrays.sort(arr);
    while(i<j){
        if(arr[i]+arr[j]<target){
            i++;
        }else if(arr[i]+arr[j]>target){
            j--;
        }else if(arr[i]+arr[j]==target){
            return true;
        }
      }
        return false;
    }
public static void main(String[] args) {
    int arr[]={1, 6, 2, 10, 3};
    int target=11;
    int n=arr.length;
    System.out.print((twoSum(arr, n, target)));
}
}