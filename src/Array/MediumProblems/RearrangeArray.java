package Array.MediumProblems;
import java.util.*;

/*Brute force approach
 * As mentioned in the problem we have to rearrange tha arr as +,-,+,-,+,+
 * we can create a temp arr or lsit to store the positive & negative no;
 * 
 * if there are n elements in array than n/2 will be positive & n/2 will be negative
 * 
 * TC - O(N)+O(N)
 * SC- O(N)  - For storing the resulting arr
 */
/* public class RearrangeArray {
    public static int[] rearrangeArray(int arr[], int n){
        ArrayList<Integer>positive=new ArrayList<>();      //list for positive arr elements
        ArrayList<Integer>negative=new ArrayList<>();      //list for negative arr elements

        for(int i=0; i<n; i++){                           //traversing whole arr
            if(arr[i]>0){                                  // adding positive in list
                positive.add(arr[i]);
            }else{
                negative.add(arr[i]);                     //adding negative in list
            }
        }
        for(int i=0; i<n/2; i++){                         //traversing the arr for both +ve & -ve to copy then into original arr
            arr[2*i]=positive.get(i);                    //as the pattern says in result arr that +ve element will be on even position
            arr[2*i+1]=negative.get(i);                  //-ve elements will be on odd positions
        }
            return arr;
    }


    public static void main(String [] args){
        int arr[]={ 1, -1, -3, -4, 2, 3};
        int n=arr.length;
      
        System.out.print(Arrays.toString(rearrangeArray(arr,n)));

    }
}


*/

/*optimized approach 
 * tc- O(n) - for single traversal
 * sc- O(n) - for storing result
*/

public class RearrangeArray {
    public static int[] rearrangeArray(int arr[], int n){
               int resultArr[]=new int[n];     // arr to store result
               int positive=0;              //starting index of positive element
               int negative=1;              //statrting index of negative element
               for(int i=0; i<n; i++){      //traversing whole element 
                if(arr[i]<0){
                    resultArr[negative]=arr[i];     //adding negative into resultarr
                
                     negative+=2;                 //incrementing ti next odd index
            }else{
                        resultArr[positive]=arr[i];   //adding positive element
                         positive+=2;                 //incrementing to next even index
            }
               }
               return resultArr;
    }
        public static void main(String [] args){
            int arr[]={ 1, -1, -3, -4, 2, 3};
            int n=arr.length;
          
            System.out.print(Arrays.toString(rearrangeArray(arr,n)));
    
        }
    }