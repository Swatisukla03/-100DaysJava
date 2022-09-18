package Day20;

import java.util.Arrays;

import Day4.sortArray;

public class quickSort {


    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int  partition(int arr[],int l,int h){
        int pivot=arr[l];
        int i=l;
        int j=h;
        if(i<j){
            while(arr[i]<pivot)
            i++;
            while(arr[j]>pivot)
            j--;


            if(i<j)
            swap(arr, i, j);
            
        }
        swap(arr,j,l);

        return j;

    }


    public static void QuickSort(int arr[],int l,int h){
        if(l<h){
            int pivot=partition(arr,l,h);
            QuickSort(arr,l, pivot-1);
            QuickSort(arr,pivot+1, h);
        }
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={4,7,1,2,3,5,9,19,11};
       int n=arr.length;
        QuickSort(arr,0,n-1);
        // Arrays.toString(arr);
        printarray(arr);
        
    }
    
    
}
