package day7;

import java.util.Arrays;

public class arrayProductExceptElement {
    public static void main(String[] args) {
        
    }
    public static void APES1(int[] arr){
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int p=1;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    p*=arr[j];
                }
            }
            arr[i]=p;
        }
        System.out.println(Arrays.toString(ans));
    }
    public static void APES2(int[] arr){
        int[] lp=new int[arr.length];
        int [] rp=new int[arr.length];
        int[] ans=new int[arr.length];
        int p=1;
        for(int i=0;i<arr.length;i++){
            lp[i]=p;
            p*=arr[i];
        }
        p=1;
        for(int j=arr.length-1;j>=0;j--){
            
        }
    }
    
}
