package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Frequency {
	static void frequency(int arr[], int n) {
		HashMap<Integer, Integer>m=new HashMap<>();
		for(int i=0; i<n; i++) {
			m.put(i,m.getOrDefault(i,0)+1);
			for(Map.Entry<Integer,Integer>entry:m.entrySet());
			
			System.out.println(entry.getKey()+" " entry.value());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,15,20,15,30,30,5};
		int n= arr.length;
		frequency(arr,n);
		

	}

}
