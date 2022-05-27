package practice.practiceD1;
import java.util.Scanner;

public class arrayClassprac {
    public static void main(String[] args){
        int[][] arr=new int[3][4]; //method1
        int[][]brr={{1,2,3},{4,5,6},{7,8,9}}; //method2
        Scanner sc=new Scanner( System.in);  //method3
        int[][] crr=new int[3][];
        System.out.println(crr[0]);
        crr[0]=new int[3];//assign the values
        crr[1]=new int[4];
        crr[2]=new int[5];
        display(crr);

    }
    public static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------");
        for(int[] i:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
