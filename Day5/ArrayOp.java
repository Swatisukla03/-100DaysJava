package Day5;

import java.util.Arrays;

import Day4.reverse;

public class ArrayOp {
    public static void main(String[] args) {
        int[] arr={3,2,4,1,5,0};
        maxA(arr); //calling the max no
        reverse(arr,1,4);
        // System.out.println(reverseNo]);
        System.out.println(Arrays.toString(arr));

        
    }
    public static void maxA(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max)
            {
                max=i;
            }
        }
        System.out.println(max);
    }
    public static int search(int[] arr,int ele){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                return i;
            }
        }
        return -1;

    }
    public static void reverse(int[] arr,int si,int ei){
        //  si=0;
        // ei=arr.length-1;
        while(si<ei){
            int t=arr[si];
            arr[si]=arr[ei];
            arr[ei]=t;
            si++;
            ei--;
        }
    }
    
}
