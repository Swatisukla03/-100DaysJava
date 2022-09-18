package practice.practiceD4;

public class floor {
    public static void main(String[]args){
        int[]arr={-18,7,5,16,15,10,22,32,21};
        int target=23;
        int ans=floor(arr,target);
        System.out.println(ans);

    }
    static int floor(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return start;

    }
    
}
