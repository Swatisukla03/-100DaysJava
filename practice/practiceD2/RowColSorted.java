package practice.practiceD2;

public class RowColSorted {
    public static void main(String[]args){
        int[][]arr={{1,3,5,8},{4,6,12,14},{5,7,13,15},{6,8,14,16}};




        // int ele= search(arr,15);
        // System.out.println(search(arr,45));
        searchele(arr, 1);
         

    }
    // public static boolean search(int[][] arr,int key){
    //     int row=0;
    //     int col=arr[0].length-1;
    //     while(row<arr[0].length &&col>=0){
    //         if(arr[row][col]==key){
    //             return true;
    //         }
    //         else if(arr[row][col]>key){
    //             col--;

    //         }
    //         else{
    //             row++;
    //         }
    //     }
    //     return false;


    // }
    public static int  searchele(int[][] arr,int key){
        int row=0;
        int col=arr[0].length-1;
        while(row<arr[0].length &&col>=0){
            if(arr[row][col]==key){
                System.out.println("Element found at ("+row+","+col+")\n");
                return 1;
            
            }
            else if(arr[row][col]>key){
                col--;

            }
            else{
                row++;
            }
        }
        System.out.println("Element not found");
        return 0;


    }
    
}
