package day17;

import java.util.Arrays;

public class allOccurArray {
    public static void main(String[] args) {
        int arr[]={1,3,3,4,3,3,6,7};
        int[] ans=allOccur(arr, 0, 3, 0);
        System.out.println(Arrays.toString(ans));
        
    }
    public static int[] allOccur(int arr[],int i,int ele,int count){
        if(i==arr.length){
            return new int[count];
        }
        else{
           if(arr[i]==ele)  {
            count++;
           }
           int []ans=allOccur(arr, i+1, ele, count);
           if(arr[i]==ele){
            ans[count-  1]=i;
           }
           return ans;
        }
    }
    
}
