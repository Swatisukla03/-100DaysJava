package day17;

import java.util.ArrayList;

public class lastoccurence {
    public static void main(String[] args) {
        int arr[]={1,3,3,4,3};
        allOccur(arr, 0, 3);



        
    }
    public static void allOccur(int arr[],int i,int ele){
        
        if(i==arr.length){
            return ;
        }
        else{
        if(arr[i]==ele){
            System.out.println(i);
            // return allOccur(arr, i+1, ele, n);
        }
        
           allOccur(arr, i+1, i);
        }
        public static void printoccur(int arr[],int i,int ele){
        
            if(i==arr.length){
                return ;
            }
            else{
            if(arr[i]==ele){
                // System.out.println(i);

                // return allOccur(arr, i+1, ele, n);
            }
            
               printoccur(arr, i+1, i);
            }
        }
    }
    
        }

    


    
    

