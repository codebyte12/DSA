package Array.BasicProblems;

public class MoveZeroToEnd {
    static void moveZero(int arr[], int n){
        int temp[]=new int[n];                   //creating a temp array to store non zero elements of array
        int index=0;                            // count of non zero elements
        for(int i=0; i<n; i++){                 // traversing the array to store non-zero into temp array
            if(arr[i]!= 0)
                temp[index++] = arr[i];            // non zero elements stored
            }
            for(int i=0; i<index; i++){
                arr[i]=temp[i];                      //
              }
            for(int i=index; i<n; i++){
                arr[i]=0;
            }
    }

    public static void main(String[] args){
        int arr[]={1,0,2,3,2,0,0,4,5,6};
        int n=arr.length;
        moveZero(arr, n);
        for(int i=0; i<n; i++){
        System.out.print(arr[i] + " ");
        }
    }
}

