package day11;

import java.sql.Array;
import java.util.*;


public class arrayList {
    
    public static void main(String args[]){
    int arr1[]={2,5,7,8,9};
    int arr2[]={6,8,9,10,16};
    int i=arr1.length-1;
    int j=arr2.length-1;
    int c=0;
       ArrayList<Integer> ans=new ArrayList<>();

    while(i>0 || j>0){
        int sum=c;
        if(i>=0){
            sum+=arr1[i];
            i--;
        }

        if(j>=0){
            sum +=arr2[j];
            j--;
        }

        c=sum/10;
        ans.add(sum%10);
    }
    //satisfying last condition
    if(c==1){
        // ans.add(c);
        Collections.reverse(ans);
        System.out.println(ans);
    }

     

}
    







    






    }

    

    

