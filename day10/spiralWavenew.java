package day10;

import javax.sql.rowset.spi.SyncResolver;

public class spiralWavenew {
    public static void main(String[]args){
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // display(arr);
        transpose(arr);

    }
    // public static void display(int[][] arr)
	// {
	// 	for(int j = 0; j < arr.length;j++){
    //         if(j%2==0){
    //         for( int i=0;i<arr.length;i++){

    //             System.out.print(arr[i][j]+" ");
    //         }
    //     }
    //     else{
    //         for(int i=arr.length-1;i>=0;i--){
    //             System.out.println(arr[i][j]+" ");
    //         }
    //         // System.out.println();
    //     }
    //     System.out.println();
           
    //     }
     
    // }
    // System.out.println();
    public static void transpose(int arr[][])
{
     int i, j;
    for(i = 1; i < arr.length; i++){
        for(j = 0; j <=i-1; j++){
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;

            // arr[i][j] = arr[j][i];

            // System.out.print(arr[i][j]+" ");
        }
        // System.out.println();
        // System.out.println();
    }
    
    
    
    // System.out.println();

}
public static void display(int [][]arr){

}
}




		
		 

    
}
