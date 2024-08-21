package Array.BasicProblems;

//Brute Force Approach
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

    //The time complexcity of this will be (i) first loop-O(n)
                                         //(ii)sexond loop-O(x)   suppose there are x no of non zero elements
                                         //(iii)third loop-O(n-x)
                                         // TC=O(n)+O(x)+O(n-x)=O(2n)

   //Space complexcity is O(n) as we are using temp arr of size n

    public static void main(String[] args){
        int arr[]={1,0,2,3,2,0,0,4,5,6};
        int n=arr.length;
        moveZero(arr, n);
        for(int i=0; i<n; i++){
        System.out.print(arr[i] + " ");
        }
    }
}

