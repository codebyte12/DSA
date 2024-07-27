package Hashing;

import java.util.HashSet;

public class distinct {
	 static int distinctelement(int arr[],int n){
	        HashSet<Integer>s=new HashSet<Integer>();
	        for(int i=0; i<n; i++){
	            s.add(arr[i]);

	        }
	        return s.size();
	    }
	    public static void main(String[] args){
	        int arr[]={10,10,10,5,7,9,4,7,4,7};
	        int n=arr.length;
	        System.out.print(distinctelement(arr,n));
	    } 

	
	
	

	

}
