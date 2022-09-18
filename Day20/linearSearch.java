package Day20;

public class linearSearch {
    public static int searchArray(int arr[],int key){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==key)
            return i;
        }
        return -1;

    }
    public static void main(String args[]){
        int arr[]={2,4,6,7,8,9,10,13,15};
        int key=17;
        int result=searchArray(arr, key);
        if(result==-1){
            System.out.println("Not Found ");
        }
        else{
            System.out.println(result);
        }

    }
    
}
