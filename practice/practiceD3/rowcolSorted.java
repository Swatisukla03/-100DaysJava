package practice.practiceD3;

public class rowcolSorted {
    public static void main(String[] args){
        int[][]arr={{1,3,5,8},{4,6,12,14},{5,713,15},{6,8,14,16}};
        System.out.println(search(arr,10));



    }
    public static boolean search(int[][] arr,int ele){
        int row=0;
        int col=arr[0].length-1;
        while(col>=0 && row<arr.length){
            if(arr[row][col]==ele){
                return true;
            }
            else if(arr[row][col]>ele){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
    
}
