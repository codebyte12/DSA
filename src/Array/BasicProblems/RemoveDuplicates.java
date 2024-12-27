package Array.BasicProblems;

/*Optimal Approach - Using two pionter Approach*/
/*tc will be O(n) for 1 pass */
/*SC will be O(1) */
public class RemoveDuplicates {
   static int removeDuplicates(int[] arr, int n){
    int i = 0;                               //place first pointer at 0 index
    for(int j=1; j<n; j++){                  //place second pointer at i+1 index
        if(arr[i]!=arr[j]){                  // if i!=j increment i and update the value of i=j
         i++;
           arr[i]=arr[j];
        }
    }
    return i+1;                             //return the total no of elements as i will 3 but total no of elements will be 4
}
         public static void main(String[] args){
           int arr[]={0,0,3,3,5,6};
           int n=arr.length;
           int result= removeDuplicates(arr, n);
           for(int i=0; i<result; i++){
           System.out.print(arr[i] + " ");
        }
     }
   }


/*If set is given & have to return the set only */
/*The tc of this is 
                    (i) O(N) for first loop as it will iterate through 0-n to find unique elements
   The Sc of this is O(n) as set needs to add n elements */

  /*  public class RemoveDuplicates{
   public static Set<Integer>removeDuplicates(Integer[] arr){
      HashSet<Integer>s=new HashSet<>();
      
      for(int i:arr){
         s.add(i);
      }
      return s;
   }

   public static void main(String[] args){
    Integer[] arr={0,0,3,3,5,6};
    HashSet<Integer>result= (HashSet<Integer>) removeDuplicates(arr);
      
        System.out.print(result);
    }
   }                                              */



/*If int is given brute force approach include creating a set and returning integer */

// public class RemoveDuplicates{
//    static int removeDuplicates(int arr[], int n){
//       HashSet<Integer>s=new HashSet<>();                         //Initialize a hashset
                                                           
//       for(int i:arr){                                           //Interate through arr
//          s.add(i);                     //add elements to set as set doesn,t contain duplicates it will add uniqueEle
//       }
 

//       int uniquesElements=s.size();                //store the size of unique elents
//       int index=0;                                 //now place the pointer on actual arr and iterate the set
//       for(int i:s){                                  
//          arr[index]=i;                             //add elements back to arr
//          index++;
//       }
//       return uniquesElements;                     

//    }

//    public static void main(String[] args){
//               int arr[]={3,0,3,0,5,3,5,6,4};
//               int n=arr.length;
//              int result = removeDuplicates(arr, n);
//              for(int i=0; i<result; i++)
//             System.out.print(arr[i] + " ");
             
//            }
//         }
