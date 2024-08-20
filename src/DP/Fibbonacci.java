package DP;

//fibbonacci no=0,1,1,2,3,5,8..............

public class Fibbonacci {
    static int fibb(int n){
        if(n<=1){
            return n ;
        }else
        return fibb(n-1)+fibb(n-2);
    }

    public static void main(String[] args) {
       int n=5;
        System.out.println(fibb(n));
    }

}
