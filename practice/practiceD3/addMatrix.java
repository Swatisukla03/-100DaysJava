package practice.practiceD3;

public class addMatrix {

    public static void main(String[] args) {
        int row = 3, col = 3;
        int a[][] = { { 1, 2, 3 }, { 4, 7, 8 }, { 9, 3, 7 } };
        int b[][] = { { 1, 3, 4 }, { 2, 4, 8 }, { 1, 2, 4 } };

        // for(int i=0;i<3;i++){
        // for(int j=0;j<3;j++){
        // c[i][j]=a[i][j]+b[i][j];
        // System.out.print(c[i][j]+" ");

        // }
        // System.out.println();
        int c[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }

        }

        for (int[] i : c) {
            for (int j : i) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }
}
