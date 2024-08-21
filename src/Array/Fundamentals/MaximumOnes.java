package Array.Fundamentals;

 class MaximumOnes {
   static int maximumConsecutive1(int arr[], int n){
                  int count=0;             //count of 1
                  int result=0;            //maximum count
                  for(int i=0; i<n; i++){
                    if(arr[i]!=1){
                        count = 0;           //if encounter value other than 1 than count will reset to 0;
                    }else{
                    count++;                  // if encounter with 1 then count will increment
                    result = Math.max(result, count);
                    }
                  }
                  return result;
   }
   public static void main(String[] args) {
       int arr[]={1, 1, 0, 0, 1, 1, 1, 0};
       int n=arr.length;
       System.out.print(maximumConsecutive1(arr,n));
   }
}

