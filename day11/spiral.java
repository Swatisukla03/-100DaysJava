package day11;
import java.util.*;

public class spiral {
    public static void main(String[]args){
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
		
		sp(arr);
    }
    public static void sp(int[][]arr){
        // int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int count=0;
        int max_size=maxr*maxc;

        while(count<max_size){
            //top wall
            for(int i=minc;i<=maxc && count<max_size;i++){
                System.out.print(arr[minr][i]+" ");
                count++;
                
            }
             minr++;
            

            //right wall
            for(int i=minr;i<=maxr && count<max_size ;i++){
                System.out.print(arr[i][maxc]+" ");
                count++;
                
            } maxc--;
            //bottom wall
            for(int i= maxc;i>=minc  &&  count<max_size ;i--){
                System.out.print(arr[maxr][i]+" ");
                count++;
              

            }   maxr--;
            //left
            for(int i= maxr;i>=minr && count<max_size ;i--){
                System.out.print(arr[i][minc]+" ");
                count++;
               
            }  
            minc++;
            // System.out.println();

        }
    }

    




        // int  arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // Spiral(arr);


    
    }
    

    

