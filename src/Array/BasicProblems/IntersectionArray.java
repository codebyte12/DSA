package Array.BasicProblems;
import java.util.*;

/*brute force approach */
/*tc- O(N) * O(M) whr n & m are size of arr1 & arr2 */
/*sc- O(M) + O(k) where m is size of arr2 & k is size of arrlist */

/* 
public class IntersectionArray {
    static int[] intersectionArray(int arr1[], int arr2[]){
        ArrayList<Integer>l=new ArrayList<>();             //create arraylist to store the common elements
        
        int [] visted=new int[arr2.length];                //create of temp arr of size of arr2
        Arrays.fill(visted,0);               //fill it with 0 if i==j then mark j=k as this element is visited

        for(int i=0; i<arr1.length; i++){           //traverse first arr

            for(int j=0; j<arr2.length; j++){       //traverse second arr
                if(arr1[i]==arr2[j]){
                    l.add(arr1[i]);               //adding common element to list
                    visted[j]=1;                 //marking for already visited element
                    break;
                }
                if(arr2[j]>arr1[i]){            //if index of j>i that break
                    break;
                }
            }
        }
            int resultArr[]=new int[l.size()];         // create a resulting arr of arraylist size
            int index=0;
            for(int i:l){
                resultArr[index++]=i;                   //add elements to array 
            }
        return resultArr;
    }
    
    public static void main(String[] args) {
        int arr1[]={1,2,3,3,4,5,6,7,8};
        int arr2[]={2,3,3,4,4,5,6};
       // int [] result=intersectionArray(arr1, arr2);
        
            System.out.print(Arrays.toString(intersectionArray(arr1, arr2)));
        }
    }

*/


/*optimized Approach - using two pointer approch */
/*tc -  */

public class IntersectionArray {
    static int[] intersectionArray(int arr1[], int arr2[]){
        ArrayList<Integer>l=new ArrayList<>();
        int i=0; 
        int j=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                l.add(arr1[i]);
                i++;
                j++;
            }
        }
            int result[]=new int[l.size()];
            int index=0;
            for(int num:l){
                result[index++]=num;
            }
            return result;
        
    }
   public static void main(String[] args) {
    int arr1[]={1,2,3,3,4,5,6,7,8};
    int arr2[]={2,3,3,4,4,5,6};
   // int [] result=intersectionArray(arr1, arr2);
    
        System.out.print(Arrays.toString(intersectionArray(arr1, arr2)));
    }
}
