package practice.practiceD3;

public class interchangeCol {
//     static void swap(input_matrix[][]){
//         int matrix_length=input_matrix.length;
//         for(int i=0;i<input_matrix[0].length;i++){
//             int temp=input_matrix[i][0];
//             input_matrix[i][0]=input_matrix[i][matrix_length-1];
//             input_matrix[i][matrix_length-1]=temp;


//         }
//     }
//     public static void main(String []args){
//         int input_matrix[][]={{4,5,6},
//                             {1,7,3,4},
//                              {11,12,13,14},
//                             {3,4,6,8}

//     };
//     System.out.println("The matrix is defined as :");
//     for(int i=0;i<input_matrix.length;i++){
//         for(int j=0;j<input_matrix[0].length;j++){
//             System.out.print(input_matrix[i][j]+" ");
//             System.out.println();
//         }
         
//     }
//     swap(input_matrix);
// }

//     }
static void swap(int input_matrix[][]) {
    int matrix_length = input_matrix.length;
    for (int i = 0; i < input_matrix[0].length; i++) {
       int temp = input_matrix[i][0];
       input_matrix[i][0] = input_matrix[i][matrix_length - 1];
       input_matrix[i][matrix_length - 1] = temp;
    }
    System.out.println("\nThe matrix after swapping the elements: ");
    for (int i = 0; i < input_matrix.length; i++) {
       for (int j = 0; j < input_matrix[0].length; j++)
          System.out.print(input_matrix[i][j] + " ");
       System.out.println();
    }
 }
 public static void main(String args[]) {
    int input_matrix[][] = {
       { 4, 5, 6, 7 },
       { 1, 7, 3, 4 },
       { 11, 12, 13, 14 },
       { 23, 24, 25, 50 }
    };
    System.out.println("The matrix is defined as: ");
    for (int i = 0; i < input_matrix.length; i++) {
       for (int j = 0; j < input_matrix[0].length; j++)
          System.out.print(input_matrix[i][j] + " ");
       System.out.println();
    }
    swap(input_matrix);
 }
}

