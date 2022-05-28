package practice.practiceD3;
import java.util.*;

public class ThreeDdeterminant {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int [][]arr=new int[3][3];
    int i,j,d=0;
    for( i=0;i<3;i++){
        for(j=0;j<3;j++){
            arr[i][j]=sc.nextInt();
        }
    }
     int x=(arr[1][1]* arr[2][2])-(arr[2][1]*arr[1][2]);
     int y=(arr[1][0]*arr[2][2])-(arr[2][0]*arr[1][2]);
     int z=(arr[1][0]*arr[2][1])-(arr[2][0]*arr[1][1]);

     d=(arr[0][0]*x)-(arr[0][1]*y)+(arr[0][2]*z);

     System.out.println("The Determinant of 3*3 ="+d);
}




    }

    

