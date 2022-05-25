package Day5;

import java.util.Scanner;

public class ArrayDemo {
    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
       
        int[] arr,c;
        arr=new int[9];
        System.out.println(arr);  //print only address
        System.out.println(arr.length); //prints the length
        arr[1]=100;
        System.out.println(arr[1]);

        int brr[],d;
        brr=new int[5];

        brr[1]=10;
        System.out.println(brr[1]);

        brr=arr;
        System.out.println(brr[1]);

        int[] arr1;
        arr1=new int[]{1,3,6,8,9};

        display(arr);
    }
    public static void display(int[] arr){
        int ind=0;
        for(int i:arr){
            System.out.print(i+" ");
            // arr[ind] *=10;
            // ind++;
        }
        System.out.println();
    }
    public static int[] takeInput(int n){
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    
}
