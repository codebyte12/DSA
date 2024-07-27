package Array.Hashing;
import java.util.Hashing;
//Given an array we have count the distinct element
public class Distinct {
    static int distinctelement(int arr[]){
        HashSet<Integer>s=new HashSet<Integer>();
        for(int i=0; i<n; i++){
            s.add(arr[i]);

        }
        return s.size();
    }
    public static void main(String[] args){
        int arr[]={10,10,10,5,7,9,4,7,4,7};
        int n=arr.length;
        System.out.print(distinctelement(arr));
    } 


}
