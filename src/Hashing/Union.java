package Hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class Union {
    static int[] union(int a[], int b[], int n, int m) {
        HashSet<Integer> s = new HashSet<>();
       // ArrayList<Integer> l = new ArrayList<>();

        // Add elements of array a to the set and list
        for (int i = 0; i < n; i++) {
            s.add(a[i]);  // Only add to list if it's a new element
               // l.add(a[i]);
            
        }

        // Add elements of array b to the set and list
        for (int i = 0; i < m; i++) {
            s.add(b[i]);  // Only add to list if it's a new element
               // l.add(b[i]);
            
        }

        // Convert the list to an array
        int[] res = new int[s.size()];
        int index=0;
        for (int i:s) {
            res[index++] = i;
        }

        return res;
    }

    public static void main(String[] args) {
        int a[] = {15, 20, 5, 5};
        int b[] = {15, 15, 15, 10};
        int n = a.length;
        int m = b.length;
        int union1[] = union(a, b, n, m);
        for (int i : union1)
            System.out.print(i + " ");
    }
}
