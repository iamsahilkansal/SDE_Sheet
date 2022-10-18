import java.util.* ;
import java.io.*;
public class Solution {
    public static void setZeros(int matrix[][]) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] matrix2=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix2[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    for(int x=0; x<m; x++){
                        matrix2[x][j]=0;
                    }
                    for(int x=0; x<n; x++){
                        matrix2[i][x] = 0;
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        int t=ip.nextInt();
        for(int i=0;i<t;i++){
            int m=ip.nextInt();
            int n=ip.nextInt();
            int[][] matrix=new int[m][n];
            for(int j=0;j<m;j++){
                for(int k=0;k<n;k++){
                    matrix[j][k]=ip.nextInt();
                }
            }
            setZeros(matrix);
        }                 
    }
}
