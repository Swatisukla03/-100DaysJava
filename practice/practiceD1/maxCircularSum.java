package practice.practiceD1;
import java.util.*;

public class maxCircularSum {
    public static void main(String[] args){
        int[] arr={1,-2,3,4,-5,6,-100};
        System.out.println(Math.max(kadaness(arr),maxCircular(arr)));
    }
    public static int kadaness(int[] arr){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i:arr){
            sum +=i;
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static int maxCircular(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            arr[i]*=-1;
        }
        int x=kadaness(arr);
        return sum+x;
    }
    
}
