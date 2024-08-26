package Array.BasicProblems;
import java.util.*;


/*BRUTE FORCE APPROACH */
/*As hashset doesn't store duplicates elements but adding elements in hashset on average for per element is O(1) 
 * but hashset doesn't preserve the position of insertion and deletion so we need another set such as TreeSet 
 * of size of hashset to maintain the order of insertion or we can sort the resulting arr */

/*In tree set for maintaining the order of insertion & deletion it takes logn time as it is a self binancing BST */

/*or we can use arrlist of size of hashset to add elements into it after adding into hashset and sort it throgh 
 * collections.sort() */

/*TC(in case of only hashset-order is not preserved) - O(1) average & O(n) as n elements for first traversal 
 *                                                   - O(1) average & O(m) as m elements in second traversal
 * tc of result arr - O(n+m) [worst case if all the elements in both arr are different and have to add every element] 
 * Total tc- O(n)+O(m)+ O(n+m)
*/


public class UnionArray {
        static int[] union(int nums1[], int nums2[], int n, int m){
            HashSet<Integer>s = new HashSet<>();      //create a empty hashset

            for(int i=0; i<n; i++){                 //traverse the arr1             
                s.add(nums1[i]);                    //add array elements into hashset
            }
            for(int i=0; i<m; i++){                //traverse the arr2
                s.add(nums2[i]);                  //add elements of arr2 in hashset which are not present in arr1
            }
            int result[]=new int[s.size()];        //now create a arr of hashset size
            int index=0;
            for(int i:s){                         //add element of hashset in result arr
                result[index++]=i;
            }
            return result;
        }
/*As we know hashset doesn't preserve the order of elements so there are two ways to get arrays in soerted manner
  1) Sort the result array   tc will be then O(n+m)log(nlog(n+m) 
  2) using treeset so that the order of elements will be preserved with above complexity*/        


        public static void main(String[] args) {
            int nums1[]={1,2,3,4,5,6};
            int nums2[]={1,2,6,8,9};
            int n=nums1.length;
            int m=nums2.length;
    System.out.print(Arrays.toString(union(nums1, nums2, n, m)));
        }
}
