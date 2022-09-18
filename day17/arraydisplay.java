package day17;

public class arraydisplay {
    public static void main(String[] args) {
        int n=5;
        int arr[]={1,2,3,4,5};
        // displayArray(arr, 0);
        displayArray1(arr, arr.length-1);
              
    }
    // public static void displayArray(int arr[],int i){
    //     if(i==arr.length){
    //         return ;

    //     }
    //     System.out.println(arr[i]);
         
    //     displayArray(arr, i+1);
         



    // }
     public static void displayArray1(int arr[],int i){
        if(i==-1){
            // System.out.println(i);
            return ;

        }
         
        // System.out.println(arr[n]);
        displayArray1(arr, i-1);
        System.out.println(arr[i]);
         



    }

    
}
