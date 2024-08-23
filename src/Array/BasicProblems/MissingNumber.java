package Array.BasicProblems;

/*Brute force Approach */
/*TC will be O(n^2) */
/*Sc will be O(1) */

/* public class MissingNumber {
    static int missingNumber(int arr[], int n){
        for(int i=0; i<=n; i++){
            int flag=0;                         //Assume num is missing 
            for(int j=0; j<=n-1; j++){
                if(arr[j]==i){
                    flag=1;                      //if element exist break the loop
                    break;
                }
               }
                if(flag==0){
                    return i;                   //if flag remains 0 means element doesnot exist return i
                }
             }
                 return -1;
        }

public static void main(String [] args){
    int arr[]={0,2,3,1,4};
    int n=arr.length;
    System.out.print(missingNumber(arr, n));
}
}      
    */

/*Optimized Approch */
/*TC will be o(n) for single traversal */
/*SC will be O(1) as no extra space is used */

 /*   public class MissingNumber {
    public static int missingNumber(int arr[], int n){
        int sum=n*(n+1)/2;                        //calculate the sum of n natural num through this formula
        int arrSum=0;                             // take the sum of the given arr as 0
        for(int i=0; i<n; i++){                   //traverse the whole array 
            arrSum += arr[i];                      //compute the sum of given array
        }
        return sum-arrSum;                       //if we subtract sumArr from sum of natural num than we find missing num 
    }

public static void main(String [] args){
    int arr[]={0,2,3,1,4};
    int n=arr.length;
    System.out.print(missingNumber(arr, n));
}
}
    */



/*More optimize approach as the above approch cant handle large integers such as 10^5 we need long var in that case 
    because int can overflow */
/*going to implement XOR operation i.e XOR of two same num will be 0 */
/*a^a=0, 1^1=0, 1^1^2^2=0, 1^1^1^1^1=1(here there are two pairs of 1 whic will give result as 0 on XOR operation but when one extra 1
      will do XOR operation i.e 0^1=1) */

   /*the XOR states that when same num performed operation it it will result in 0 other the different num will be the outcome */ 

  /*the TC in this approach is O(2n) whic can be further optimized to O(n) */ 
  /*Sc is O(1) */

/* public class MissingNumber {
  static int missingNumber(int arr[], int n){
    int XOR1=0;                                 //initialize xor of n num as 0
    for(int i=0; i<=n; i++){                    //traverse the n num
        XOR1=XOR1^i;                            //compute the xor as 0^1^2^3^4^5
    }
    int XOR2=0;                                //initialize xor of given num as 0
    for(int i=0; i<n; i++){                    //traverse the arr
         XOR2=XOR2^arr[i];                     //compute the xor of given arr i.e 0^1^2^3^4
      }
      return XOR1^XOR2;                         //when combined opertion is performed on n numbers and given arr than 
                                               // we will get missing num
  }
public static void main(String [] args){
    int arr[]={0,2,3,1,4};
    int n=arr.length;
    System.out.print(missingNumber(arr, n));
}
}
    */



public class MissingNumber {
    static int missingNumber(int arr[], int n){
      int XOR1=0;                              //Xor of n natural num
      int XOR2=0;                              //xor of given array
      for(int i=0; i<n; i++){                   //traverse the whole arr
           XOR2=XOR2^arr[i];                   //compute xor of given arr
           XOR1=XOR1^(i+1);                    //compute XOR of n num (Reason for incrementing i is that loop is running for n-1 variables)
        }
        return XOR1^XOR2;
    }
  public static void main(String [] args){
      int arr[]={0,2,3,1,4};
      int n=arr.length;
      System.out.print(missingNumber(arr, n));
  }
  }
  