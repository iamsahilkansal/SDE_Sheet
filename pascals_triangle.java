import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static int fact(int n){
        int fact =1;
        while(n>0){
            fact=fact*n;
            n=n-1;
        }
        return fact;
    }
    public static void printPascal(int array[]){
        int t=array.length;
        for(int i=0;i<t;i++){
            int n=array[i];
            for(int r=0;r<n;r++){
                for(int k=0;k<=r;k++){
                    System.out.print(fact(r)/(fact(k)*fact(r-k))+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        int t=ip.nextInt();
        int[] array=new int[t];
        for(int i=0;i<t;i++){
            array[i]=ip.nextInt();
        }
        printPascal(array);
    }
}

