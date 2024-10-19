package Array.HardProblems;

import java.util.ArrayList;
import java.util.List;


/*How many majority element(n/3) can occur in arr - max 2 elements  */
/*eg - arr[]= {1,2,1,1,3,2,2} element with more than n/3 occurance  majority = [1,2] */
/* length of arr=7; 7/3=2; element appearing more tha 2 times will be tha majority element */

/*lets take an example of arr length= 9 */
/* arr[]={1,2,1,1,3,4,3,2,3}
 * n/3=3; element should appear more than 3 times
 * here 1 appears 3 time 2 appear 3 times 3 appear times
 */


 /*Brute force */
 /*create a empty list to store the multiple items */
/* tc - O(n^2) 
 * sc - O(1) because list is storing only two elements which can can be constant
*/

public class MajorityElement2 {
   public List<Integer>majority(int arr[], int n){

    List<Integer>ans=new ArrayList<>();              //initializing empty list to store majority elements

    for(int i=0; i<n; i++){                          //traversing arr
        if(ans.isEmpty() || ans.get(0)!=arr[i]){       //checking if list is empty and if not than elememt in list is not eqaual to arr element
             int count=0; 
                                            //initializing count as 0
       for(int j=0; j<n; j++){                          
        if(arr[j]==arr[i]){
            count++;
        }
       }
    
       if(count>n/3){                         //checking for tha majority
        ans.add(arr[i]);
       }
    }
        if(ans.size()==2){                //as we know the max element can be 2 in arr of length 7 when the size of list ==2
            break;                        //break & return
        }
    }
       return ans;
   }
   public static void main(String[] args) {
       int arr[]={1,2,1,1,3,2,2};
       int n=arr.length;
       MajorityElement2 sol = new MajorityElement2();
       List<Integer>ans=sol.majority(arr,n);
       for(int i:ans){
       System.out.print(i + " ");
       }
   }
}
