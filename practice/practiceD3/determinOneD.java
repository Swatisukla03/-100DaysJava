package practice.practiceD3;

import java.util.Scanner;

public class determinOneD {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int[2][2];
        int i,j,D=0;
        for( i=0;i<2;i++){
            for( j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        D=(arr[0][0]*arr[1][1]-(arr[0][1]*arr[1][0]));
        System.out.println("The determinant of the matrix is :"+D);
    }
    
}
