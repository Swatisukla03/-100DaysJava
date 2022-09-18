package day17;

public class sortArray {
    public static void main(String[] args) {
        int arr[]={4,5,7,2,2,8};
        // System.out.println(sortEle(arr, 0, 4));  
        System.out.println(sortEle1(arr, arr.length,2 ));
        
    }
    // public static int sortEle(int arr[],int i,int key){
    //     if(arr[i]==key){
    //         return i;
    //     }
    //     else{
    //        return  sortEle(arr, i+1, key);
    //     }

    // }
    public static int sortEle(int arr[],int i,int key){
        if(i==arr.length-1){
            return -1;
        }
        else{
        if(arr[i]==key){
            return i;
        }
        else{
           return  sortEle(arr, i-1, key);
        }
    }

    }
    public static int sortEle1(int arr[],int i,int key){
        if(i==arr.length-1){
            return -1;
        }
        else{
        if(arr[i]==key){
            return i;
        }
        else{
           return  sortEle1(arr, i+1, key);
        }
    }

    }
    
}
