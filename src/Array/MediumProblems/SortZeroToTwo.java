package Array.MediumProblems;
import java.util.*;



/*Brute force approach 
 * 
 * Sort the arr & return the arr
 * 
 * tc- O(nlogn)
 * sc-O(1)
*/

/* 
public class SortZeroToTwo {
     public static int[] sortZeroToTwo(int arr[], int n){

        Arrays.sort(arr);
        return arr;
     }
     public static void main(String[] args) {
         int arr[]={1,0,1,2,2,0};
         int n=arr.length;
         System.out.print(Arrays.toString(sortZeroToTwo(arr, n)));
     }
}
*/




/*Better Approach 
 * Create a three different list for 0,1 & 2
 * traverse the arr & add elements into the separate list created
 * after adding into the list take the index of original arr & put them back into original arr
 *
 * TC - O(n)
 * SC - O(n) - storing the elements
*/

/* 
public class SortZeroToTwo {
    public static int[] sortZeroToTwo(int arr[], int n){
          ArrayList<Integer>zero=new ArrayList<>();
          ArrayList<Integer>one=new ArrayList<>();
          ArrayList<Integer>two=new ArrayList<>();

          for(int i=0; i<n; i++){
            if(arr[i]==0){
                zero.add(arr[i]);
            }else if(arr[i]==1){
                one.add(arr[i]);
            }else{
                two.add(arr[i]);
            }
          }
          int index=0;
          for(int i=0; i<zero.size(); i++){
            arr[index++]=zero.get(i);
          }
          for(int i=0; i<one.size(); i++){
            arr[index++]=one.get(i);
          }
          for(int i=0; i<two.size(); i++){
            arr[index++]=two.get(i);
          }
          return arr;
        
    }
    public static void main(String[] args) {
        int arr[]={1,0,1,2,2,0};
        int n=arr.length;
        System.out.print(Arrays.toString(sortZeroToTwo(arr, n)));
    }
}
*/




/*Optimal Approach - DUTCH NATIONAL FLAG ALGORITHM */
/*this algorithm states:
 *                      0 to low-1      (filled with 0)   -> extreme left
 *                      low to mid-1    (filled with 1)
 
 *                      mid to high     (filled with unsorted arr we need to sort this )
 
 *                      high+1 to n-1   (filled with 2)   ->extreme right 
 * 
 * this algorithm uses three pointer 
 * int mid, int low; int high;
 * 
 * there will be three cases:
 *                          1)  arr[mid]==0; swap(arr[mid],arr[low])
                                mid++; low++;

                            2)  arr[mid]==1;
                                  mid++;
                                  
                            3) arr[mid]==2; swap(arr[mid],arr[high])
                                 high--;      
 * 
 */

public class SortZeroToTwo {
    public static int[] sortZeroToTwo(int arr[], int n){
             int low=0;
             int mid=0;
             int high =n-1;

             while(mid<=high){
                if(arr[mid]==0){
                    //swap mid & low
                    int temp=arr[mid];
                    arr[mid]=arr[low];
                    arr[low]=temp;
                    low++;
                    mid++;
                }
                else if(arr[mid]==1){
                    mid++;
                }else{
                    //swap mid & high
                    int temp=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp;
                    high--;
                }
             }
           return arr;
     
    }
    public static void main(String[] args) {
        int arr[]={1,0,1,2,2,0};
        int n=arr.length;
        System.out.print(Arrays.toString(sortZeroToTwo(arr, n)));
     
    }
}