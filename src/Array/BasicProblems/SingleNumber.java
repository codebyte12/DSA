package Array.BasicProblems;
//import java.util.HashMap;
//import java.util.Map;

/*Brute Force Approach  */
/*Tc-O(n^2) as two nested loops are running*/
/*Sc-O(1) no extra space is used */
/* public class SingleNumber {
              static int singleNumber(int arr[], int n){
                    for(int i=0; i<n; i++){                    //traversing the array & picking one element at a time
                        int count=0;
                        for(int j=0; j<n; j++){                //traversing the whole arr & comparing i with every element of j
                            if(arr[j]==arr[i]){
                                count++;                       //increasing count if i & j are same
                            }
                        }
                        if(count==1){                         //if any element count is 1 
                            return arr[i];                   //returning that element
                        }
                    }
                       return -1;                           //if no element count is 1
                }              

     public static void main(String[] args){
        int arr[]={4,1,2,2,1};
        int n=arr.length;
        System.out.print(singleNumber(arr,n));
     }           
}                                  
     */


/*Better Approach - Using HashMap */
/*TC - */
/*SC -  */

   /*   public class SingleNumber {
        static int singleNumber(int arr[], int n){
            HashMap<Integer,Integer>m = new HashMap<>();          //create a hashmap

            for(int i:arr){                                         //traverse the arr and add it to hashmap
                m.put(i,m.getOrDefault(i,0)+1);
            }
            for(Map.Entry<Integer,Integer>e:m.entrySet()){            //now traverse the hashmap
                if(e.getValue()==1){                               //check if any key has value 1
                    return e.getKey();                               //if 1 return that key
                }
            }
                    return -1;                                    //if elemnets present has no value of 1 return -1
        }

        public static void main(String[] args){
            int arr[]={4,1,2,2,1};
            int n=arr.length;
            System.out.print(singleNumber(arr,n));
         }           
    }         
    
    */



    public class SingleNumber {
        static int singleNumber(int arr[], int n){
            int XOR=0;
            for(int i=0; i<n; i++){
                XOR = XOR^arr[i];
            }
                    return XOR;
                    
        }

        public static void main(String[] args){
            int arr[]={4,1,2,2,1};
            int n=arr.length;
            System.out.print(singleNumber(arr,n));
         }           
    }         