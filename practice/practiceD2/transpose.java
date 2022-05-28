package practice.practiceD2;

public class transpose {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        display(arr);
        System.out.println("-----------------------------------");
        transpose(arr);
        System.out.println("--------------------------------------");
        display(arr);
        System.out.println("------------------------------*-------------------");
        newTranspose(arr);

    }

    public static void transpose(int[][] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int t = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = t;

            }
        }
    }

    public static void display(int[][] arr) {
        // for(int[]i:arr){
        // for(int j:i){
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void newTranspose(int arr[][]) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
