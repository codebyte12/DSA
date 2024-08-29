package Array.MediumProblems;
import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*Brute force approach 
 * 
 * four traversal
 * create a set ds to store unique quad
 * tc - O(n^4)  - four traversal
 * 
 * sc - O(no of quadruplets) * 2
 *       one set is used for storing unique quadruplets
 *       one list is used for returning quadruplets
 */


/* 
public class FourSum {
  public static List<List<Integer>>fourSum(int arr[], int n, int target){
          Set<List<Integer>>quad = new HashSet<>();        //space used to store quad 

          for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    for(int l=k+1; l<n; l++){
                        int sum=arr[i]+arr[j]+arr[k]+arr[l];           
                        if(sum==target){
                            List<Integer>elemIntegers= Arrays.asList(arr[i],arr[j],arr[k],arr[l]);  //if sum ==target than add i,j,k,l into list
                            Collections.sort(elemIntegers);                                        //sort the list
                            quad.add(elemIntegers);                                                //add to te set so only unique can return
                        }
                    }
                }
            }

          }
          List<List<Integer>>ans=new ArrayList<>(quad);         //space used to return result
          return ans;
  }

    public static void main(String[] args) {
         int arr[]={1, -2, 3, 5, 7, 9};
        // int arr[]={7, -7, 1, 2, 14, 3};
        // int arr[]={1, 1, 3, 4, -3};
         int target=7;
        // int target=9;
       //  int target=5;
         int n=arr.length;
         System.out.print((fourSum(arr, n,target)));
     }
     }
*/





/*Better Approach - Hashing 
arr[i]+arr[j]+arr[k]+arr[l]=target

can be written as: arr[l]=target-(arr[i]+arr[j]+arr[k])

 * create a set to store unique quad
 * create another set to search for fourth element if present
 * 
 * tc - O(n^3)   for three traversal
 *     sorting the list is always constant
 * 
 * sc- O(no of quadruplets) * 2 
 *     1 set of list is used to store unique quadruplest
 *     1 list of list is used to return unique quadruplets
*/
public class FourSum {
    public static List<List<Integer>>fourSum(int arr[], int n, int target){
            Set<List<Integer>>quad = new HashSet<>();        //space used to store quad 
                for(int i=0; i<n; i++){                      //fixing first var
                    for(int j=i+1; j<n; j++)                 
                   
                    for(int k=j+1; k<n; k++){
                        Set<Integer>s=new HashSet<>();             //initializing emplty hashset to search for fourth element
                        int l=target-arr[i]+arr[j]+arr[k];          //initialization of fourth element
                        if(s.contains(l)){                          //checking if present in hashset
                            List<Integer>elemIntegers=Arrays.asList(arr[i],arr[j],arr[k],l);      //if found into hashset adding into temp list
                            Collections.sort(elemIntegers);                                      //sorting the list
                            quad.add(elemIntegers);                                             //adding to set to store only unique elements
                        }
                        s.add(arr[k]);                      //if fourth element is not present into set tha  adding into set
                    }
                }
            
            
            List<List<Integer>>ans=new ArrayList<>(quad);         //space used to return result
            return ans;
    }
  
      public static void main(String[] args) {
        //  int arr[]={1, -2, 3, 5, 7, 9};
          int arr[]={7, -7, 1, 2, 14, 3};
          // int arr[]={1, 1, 3, 4, -3};
        //  int target=7;
           int target=9;
         //  int target=5;
           int n=arr.length;
           System.out.print((fourSum(arr, n,target)));
       }
       }







/*Optimal Approach - Two pointer approach 
 *                 - in this approach we fix two var i & j and search for other elements from k to l
 *               whr k=j+1 & l=n-1  
 * as given i!=j!=k!=l   the four variables should be unique
 * 
 * tc - O(nlogn) + O(n^3)   
 *     
 * sc - O(no of quadruplets)
*/

/* 
     public class FourSum {
        public static List<List<Integer>>fourSum(int arr[], int n, int target){
                List<List<Integer>>quad = new ArrayList<>();
                     Arrays.sort(arr);                   //sorting the array

                     for(int i=0; i<n; i++){              //fixing first var
                        if(i>0 && arr[i]==arr[i-1]){      //skiping duplicates 
                            continue;
                        }
                        for(int j=i+1; j<n; j++){           //fixing second variable
                            if(j>i+1 && arr[j]==arr[j-1]){   //skiping duplicates
                                  continue;
                            }
                            int k=j+1;                     //intializing third var
                            int l=n-1;                     //initializing fourth var

                            while(k<l){                   //using two pointer approach
                            int sum = arr[i]+arr[j];      //calculating sum of 4 var
                            sum += arr[k];
                            sum += arr[l];
                            if(sum==target){
                                List<Integer>ans=Arrays.asList(arr[i],arr[j],arr[k],arr[l]);   //if sum==target add var into list
                                quad.add(ans);                                                 //and then add them into list of list
                                k++;
                                l++;

                                while(k<l && arr[k]==arr[k-1]){      //checking for duplicates
                                    k++;
                                }
                                while(k<l && arr[l]==arr[l+1]){      //checking for duplicates
                                    l--;
                                }
                            }else if(sum<target){
                                k++;
                            }else{
                                l--;
                            }
                            }
                        }
                     }
                     return quad;              //returning quad
        
                }
    public static void main(String[] args) {
    int arr[]={1, -2, 3, 5, 7, 9};
 // int arr[]={7, -7, 1, 2, 14, 3};
 // int arr[]={1, 1, 3, 4, -3};
    int target=7;
 // int target=9;
 //  int target=5;
   int n=arr.length;
  System.out.print((fourSum(arr, n,target)));
} 
}
      
    */  