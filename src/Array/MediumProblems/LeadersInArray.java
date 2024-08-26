package Array.MediumProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*Brute force */
/* tc - O(n) * O(n) + O(n) = O(n^2) + O(n)
 *      - for first traversal - O(n)
 *      - for second traversal - O(n)
 *      - for copying back element from list to array -O(n)
 * 
 * As nested loop is used so tc will be higher precedence
 * tc - O(n^2)
 * 
 * SC - O(n)-worst case if all elements are leaders
 */
/* 
public class LeadersInArray {
static int[] leader(int nums[],int n){
    ArrayList<Integer>l=new ArrayList<>();           //create a list to store the leader in arr
     for(int i=0; i<n; i++){                        //traverse the whole array & fix 1 element and check for other element
        int leader=0;           //initialize element is leader

        for(int j=i+1; j<n; j++){       //now traverse from i+1-n to check whether all elements are small or not
            if(nums[j]>nums[i]){        // if j>i   then update laeder=false
                leader=1;               //break the loop
                break;
            }
        }
        if(leader==0){               //if leader remains 0 than add element to list
          l.add(nums[i]);
        }
     }
     int result[]=new int[l.size()];            //creating a resulting array to copy back elements from list to arr
     int index=0;
     for(int i:l){
        result[index++]=i;
     }
     return result;

}
public static void main(String[] args) {
    int nums[]={16,17,8,0,7,3};
    int n=nums.length;
    System.out.print(Arrays.toString(leader(nums,n)));
}
}


*/

/*Optimized approach - as we know last element will always be the leader 
 *                   - treversing from the back and making last element as leader & then updating
 * 
 * tc-O(n)+O(n)=O(n)
 * sc-O(n)
 */
public class LeadersInArray {
    static int[] leader(int nums[],int n){
        ArrayList<Integer>l=new ArrayList<>();
         int max = Integer.MIN_VALUE;
         for(int i=n-1; i>=0; i--){           //traversing from last to first element
            if(nums[i]>max){
                l.add(nums[i]);          //adding to list if leader
            }
            max=Math.max(max,nums[i]);    //updating max
         }
         Collections.reverse(l);        //will reverse the list as elements are stored from last
         int result[]=new int[l.size()]; //resulting array
         int index=0;
         for(int i:l){
            result[index++]=i;
         }
         return result;
    }

public static void main(String[] args) {
    int nums[]={16,17,8,0,7,3};
    int n=nums.length;
    System.out.print(Arrays.toString(leader(nums,n)));
}
}
