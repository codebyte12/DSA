package Array.HardProblems;
import java.util.*;

/*Majority Element - the element which occurs more the n/2 times in the given array is called as majority element */


/*Brute force approach -   */
/* traverse the array & select element one by one 
 * now run another loop to compare i & j elements if i==j count will increase
 * 
 * TC - O(N^2)
 * SC - O(1)
*/
/* 
public class MajorityElement {
    public static int majority(int arr[], int n){
        for(int i=0; i<n; i++){                     //traversing arr to select element one by one
            int count = 0;
            for(int j=0; j<n; j++){                 //now running another loop to compare selected elements to other elements present in the arr
                if(arr[j]==arr[i]){
                    count++;                        //increasing count if arr is same
                }
            }
            if(count>n/2){                        //checking if count of given element is more than n/2
                return arr[i]; 
            }
        }
        return -1;
    }
  public static void main(String[] args) {
      int arr[]={7, 0, 0, 1, 7, 7, 2, 7, 7};
      int n=arr.length;
      System.out.print(majority(arr, n));
  }
}

*/




/*Better Approach - Hashing (as we know hashmap always contains key & value of element) */
/* Initialize a empty hashmap
 * traverse the map to check if any key has value more tha n/2
 * 
 * tc - O(nlogn) - in case of orderd map
 * tc - O(n) - unordered map (it will be worst too )
 * 
 * SC - O(n)
 */

 /* 
public class MajorityElement {
    public static int majority(int arr[], int n){
       HashMap<Integer,Integer>m=new HashMap<>();         //initializing emplty hashmap
       for(int i=0; i<n; i++){
        m.put(arr[i],m.getOrDefault(arr[i],0)+1);        //adding elements to hashmap

       }
       for(Map.Entry<Integer,Integer>e:m.entrySet())              //traversing the map
       if(e.getValue()>n/2){                                     //checking for value more than n/2
        return e.getKey();                                       //if value is more than n/2 returning key
       }
       return -1;
    }
  public static void main(String[] args) {
      int arr[]={7, 0, 0, 1, 7, 7, 2, 7, 7};
      int n=arr.length;
      System.out.print(majority(arr, n));
  }
}

*/



/*Optimal Approach  - Boyre Moore's Algorithm */ 
/*the intuition behind the algorithm is that if any elemets occur n times than other element has to occur n times to cancel it
 * if it didn't get canelled than if majority element is present in the arr that it will be that arr
 * 
 * TC - O(n)
 * sc - O(1 )
 */



 public class MajorityElement {
    public static int majority(int arr[], int n){
         int element=0;             //initialize element as 0
         int count=0;                //initialize count as 0
         for(int i=0; i<n; i++){
            if(count==0){                  //if count==0
                count=1;                  //& make count 1
                element = arr[i];          // than initialize element var a element of arr
               
            }else if(arr[i]==element){     //if next arr element is same as element than count ++ 
                count++;
            }else{
                count--;                  //if different arr element occurs than count--
            }
        }


        //if any arr var is left in arr
        //to check if it is majority element run a loop
        ////take the count of that var
         int countMajority=0;
         for(int i=0; i<n; i++){
            if(arr[i]==element){
                countMajority++;
            }
        }
            if(countMajority>n/2){           //if it is more tha n/2 than return that element
                return element;
            }
         
        
         return -1;
    }
  public static void main(String[] args) {
      int arr[]={7, 0, 0, 1, 7, 7, 2, 7, 7};
      int n=arr.length;
      System.out.print(majority(arr, n));
  }
}
