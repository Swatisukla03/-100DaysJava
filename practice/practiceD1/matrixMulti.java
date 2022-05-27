package practice.practiceD1;
import java.util.*;

public class matrixMulti {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int n3=sc.nextInt();
    int[][] arr1=new int[n1][n2];
    int [][] arr2=new int[n2][n3];

    for(int i=0;i<n1;i++){
        for(int j=0;j<n2;j++){
            // numbers[i][j]=sc.nextInt();
            arr1[n1][n2]=sc.nextInt();


        }
    }
    for(int i=0;i<n2;i++){
        for(int j=0;j<n3;j++){
            arr2[i][j]=sc.nextInt();
        }
    }
    // int ans[n1][n3];
    int[][] ans=new int[n1][n3];
    for(int i=0;i<n1;i++){
        for(int j=0;j<n3;j++){
            ans[i][j]=0;

        }
    }

    for(int i=0;i<n1;i++){
        for(int j=0;j<n3;j++){
            for(int k=0;k<n2;k++){
                ans[i][j]+=arr1[i][k]*arr2[k][j];
            }
        }
    }

    for(int i=0;i<n1;i++){
        for(int j=0;j<n3;j++){
            System.out.print(ans[i][j]+" ");
        }
        System.out.println();
    }




    
}
}
