package practice.practiceD6;

public class firstIndex {
    public static void main(String[] args) {
        int n=10;
        int arr[]={1,3,4,5,6,3,5,6,3,2,5};
        // int last_ind=LastIndex(arr,n , 3);
        // System.out.println(last_ind);
        int first_ind=FirstIndex(arr, 0, 5);
        System.out.println(first_ind);
        
    }
    public static int LastIndex(int arr[],int i,int ele){
        if(i==0){
            return -1;
        }
        else{

            if(arr[i]==ele){
                return i;
            }
            else{
                return LastIndex(arr,i-1,ele);
            }
        }
    }
    public static int FirstIndex(int arr[],int i,int ele){
        if(i==arr.length){
            return -1;
        }
        else{

            if(arr[i]==ele){
                return i;
            }
            else{
                return FirstIndex(arr,i+1,ele);
            }
        }
    }
    
    
}
