package Array.BasicProblems;
import java.util.Arrays;
//Brute Force Approach


/* 
public class MoveZeroToEnd {
    static void moveZero(int arr[], int n){
        int temp[]=new int[n];                   //creating a temp array to store non zero elements of array
        int index=0;                            // count of non zero elements
        for(int i=0; i<n; i++){                 // traversing the array to store non-zero into temp array
            if(arr[i]!= 0)
                temp[index++] = arr[i];            // non zero elements stored
            }
            for(int i=0; i<index; i++){             //Running a loop from 0--index
                arr[i]=temp[i];                      //to copy temp arr to original arr
              }
            for(int i=index; i<n; i++){          //traversing once again from index-n
                arr[i]=0;                      // to place zeroes ata last
            }
    }
    */

    /*The time complexcity of this will be (i) first loop-O(n)
                                         (ii)second loop-O(x)   suppose there are x no of non zero elements
                                         (iii)third loop-O(n-x)
                                          TC=O(n)+O(x)+O(n-x)=O(2n)

   Space complexcity is O(n) as we are using temp arr of size n  */


//Optimized Approach [Using two pointer approach]

      public class MoveZeroToEnd {
        static int[] moveZero(int arr[], int n){
            int j=-1;                                //if 0 is not present in the whole arr
            
            for(int i=0; i<n; i++){
                if(arr[i]==0){                      //searching for the first occurance of 0
                    j=i;                            //as the 0 enountered in the arr assign j to 0
                    break;                          // break the loop as we got the first occurance of 0
                }
            }
                if(j==-1){                          // if 0 is not find
                    return arr;
                }
                for(int i=j+1; i<n; i++){              //traversing the whole arr after first occurance of 0 
                    if(arr[i]!=0){
                        //swap arr,i,j
                        int temp=arr[i];               //as soon as non zero elements encountred swap it with 0
                        arr[i]=arr[j];                 //increment j pointer i.e j will always be at 0
                        arr[j]=temp;
                        j++;
                    }
                }
                return arr;
            }
            public static void main(String[] args) {
                int arr[]={0,1,2,3,0,5,6,7};
                int n=arr.length;
            System.out.print(Arrays.toString(moveZero(arr, n)));
            }
        }

       /*       Time complexcity of this code will be (i) for first loop - O(x) i.e suppose 0 as x
                                                  (ii) for second loop - O(n-x)
                                                  TC = O(x)+O(n-x) = O(n);  
             
             Space Complexity is optimized in this as we are using only extra space to swap the
             arr so SC will be O(1) */                                     
        
   