package Array.MediumProblems;
import java.util.*;

/*brute force approch 
 * run three loops & search for the elements 
 * to store only the unique triplets create a set ds
 * 
 * tc - O(n^3)
 * sc- O(no of triplets) *2;
*/

/* 
public class ThreeSum{
    public static List<List<Integer>>threeSum(int arr[], int n){
          Set<List<Integer>>triplets=new HashSet<>();        //space used to store unique triplets
            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    for(int k=j+1; k<n; k++){
                        int sum=arr[i]+arr[j]+arr[k];
                        if(sum==0){
                            List<Integer>l=Arrays.asList(arr[i],arr[j],arr[k]);     
                            Collections.sort(l);             //sorting the triplets
                            triplets.add(l);                //adding them to set so only unique can add
                        }
                    }
                }
            }
            List<List<Integer>>ans=new ArrayList<>(triplets);    //space used to return unique triplets
            return ans;

    }
    public static void main(String[] args) {
        // int arr[]={0,-1,-2,2,2,-2,-2,0,0,-2-1,-1};
         int arr[]={2, -2, 0, 3, -3, 5};
        // int arr[]={8, -6, 5, 4};
         int n=arr.length;
         System.out.print((threeSum(arr, n)));
     }
}

*/






/*Better Approach 
 * arr[i]+arr[j]+arr[k]=0    given:i!=j!=k   
 * can be written as arr[k]= -(arr[i]+arr[j])
 * 
 * Create a empty hashset to search for the third element
 * & run a loop for for i & j; 
 * 
 * tc-O(n^2) as sorting of list is constant
 * sc - O(no of triplets) * 2 one set is used to store the triplets another list is used to return the triplets
 */

 /* 
public class ThreeSum {
    public static List<List<Integer>>threeSum(int arr[], int n){
       // Arrays.sort(arr);
         Set<List<Integer>>triplets=new HashSet<>();      //space used to store the triplets

         for(int i=0; i<n; i++){              //fixing i at first position
           Set<Integer>s=new HashSet<>();    //empty hashset to store j variable
            for(int j=i+1; j<n; j++){         //trversing j till n to find third element
                int k = -(arr[i]+arr[j]);
                if(s.contains(k)){
                List<Integer>l=Arrays.asList(arr[i],arr[j],k);
                Collections.sort(l);        //always sort the 3 integers so it is constant
                triplets.add(l); 
                }
                s.add(arr[j]);
            }
           
         }
         List<List<Integer>>ans=new ArrayList<>(triplets);              //space used to return the triplets
         return ans;
    }

public static void main(String[] args) {
   // int arr[]={0,-1,-2,2,2,-2,-2,0,0,-2-1,-1};
   // int arr[]={2, -2, 0, 3, -3, 5};
    int arr[]={8, -6, 5, 4};
    int n=arr.length;
    System.out.print((threeSum(arr, n)));
}
}

*/







/*Optimal Approach - Two pointers Approach 
 *   given = i!=j!=k   arr[i]+arr[j]+arr[k]=0
*/

/*TC - O(nlogn) + O(n^2) */
/*SC - O(no of unique triplets)   */


public class ThreeSum {
    public static List<List<Integer>>threeSum(int arr[], int n){
                      
        List<List<Integer>>triplets=new ArrayList<>();         //space used to store unique triplets
        Arrays.sort(arr);
        for(int i=0; i<n; i++){                            //fixing the first variable
            if(i>0 && arr[i]==arr[i-1]){                   //checking for duplicates
                continue;
            }
            int j=i+1;                                    //we will search for elements between j to k
            int k=n-1;
            while(j<k){

           //for larger integers use long to as for larger elements integer will overflow 
           
           //long sum = (long)arr[i]+arr[j]+arr[k];
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==0){
                 List<Integer>l=(Arrays.asList(arr[i],arr[j],arr[k]));   //if sum==0 add elemets to the list
                 triplets.add(l);                                        //add it to set for unique triplets
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1]){                     //skiping duplicates for variable j
                        j++;
                    }
                    while(j<k && arr[k]==arr[k+1]){                    //skiping duplicates for variable k
                        k--;   
                    }
                }else if(sum<0){
                    j++;
                }else{
                  k--;
                }
            }
        }
    
       return triplets;
    } 

    public static void main(String[] args) {
       // int arr[]={0,-1,-2,2,2,-2,-2,0,0,-2-1,-1};
        int arr[]={2, -2, 0, 3, -3, 5};
       // int arr[]={8, -6, 5, 4};
        int n=arr.length;
        System.out.print((threeSum(arr, n)));
    }
}

