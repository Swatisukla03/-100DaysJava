package practice.practiceD3;

import javax.sql.rowset.spi.SyncResolver;

public class BoundaryEle {
    public static void main(String[]args){
        int input_matrix[][]=new int[][]{
            {9,8,5,6},
            {2,4,6,9},
            {3,4,9,1},
            {1,2,3,5}
        };
        System.out.println("The matrix is defined as :");
        for(int x=0;x<input_matrix.length;x++){
            for(int y=0;y<input_matrix[x].length;y++){
                System.out.print(input_matrix[x][y]+" ");
            }
            System.out.println();
        }
        BoundaryEle border_values=new BoundaryEle();
        System.out.println("The border elements of the matrix is");
        for(int x=0;x<input_matrix.length;x++){
            for(int y=0;y<input_matrix[x].length;y++){
                if(x==0 ||y==0||x==input_matrix.length-1 ||y==input_matrix[x].length-1){
                    System.out.print(input_matrix[x][y]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    
}
