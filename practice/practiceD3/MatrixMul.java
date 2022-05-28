package practice.practiceD3;
import java.util.*;

public class MatrixMul {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int [][]arr1=new int[r1][c1];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                arr1[i][j]=sc.nextInt();
            }

        }
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int [][]arr2=new int[r2][c2];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2.length;j++){
                arr2[i][j]=sc.nextInt();
            }
        }

        if(c1 !=r2){
            System.out.println("Array Multiplication is Invalid");
        }
        int product[][]=new int[r1][c2];
        for(int i=0;i<product.length;i++){
            for(int j=0;j<product[0].length;j++){
                for(int k=0;k<c1;k++){
                    product[i][j]+=arr1[r1][k]*arr2[k][c2];
                }
            }
        }

        for(int i=0;i<product.length;i++){
            for(int j=0;j<product.length;j++){
                System.out.print(product[i][j]+" ");

            }
            System.out.println();
        }


    }
    
}
