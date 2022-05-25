package day6;

public class BinSearch  { 

    public static  void  binarysearch(int arr[],int si,int ei,int key){

    
    int mid=(ei+si)/2;
    while(si<=ei){
        if(arr[mid]<key){
            si=mid+1;

        }else if(arr[mid]==key){
            System.out.println("Element  found at index "+mid);
            break;

        }
        else{
            ei=mid-1;
        }
        mid=(ei+si)/2;
    }
    if(si>ei){
        System.out.println("Element is not found ");
    }
    }
    public static  void  lowerBound(int arr[],int si,int ei,int key){
        int ans=-1;

    
        int mid=(ei+si)/2;
        while(si<=ei){
            if(arr[mid]<key){
                si=mid+1;
    
            }else if(arr[mid]==key){
                System.out.println("Element  found at index "+mid);
                break;
    
            }
            else{
                ans=mid;
                ei=mid-1;
            }
            mid=(ei+si)/2;
        }
        if(si>ei){
            System.out.println("Element is not found ");
        }
        }
        public static  void  SuareRoot(int arr[],int si,int ei,int key,int no){

            int ans=-1;

            int mid=(ei+si)/2;
            while(si<=ei){

                if(arr[mid]<key){
                    si=mid+1;
        
                }else if(arr[mid]==key){
                    System.out.println("Element  found at index "+mid);
                    break;
        
                }
                while (start <= end) {
                    mid = (start + end) / 2;
         
                    if (mid * mid == number) {
                        ans = mid;
                        break;
                    }
         
                    // incrementing start if integral
                    // part lies on right side of the mid
                    if (mid * mid < number) {
                        start = mid + 1;
                        ans = mid;
                    }
         
                    // decrementing end if integral part
                    // lies on the left side of the mid
                    else {
                        end = mid - 1;
                    }
                }
         
                else{
                    ans=mid;
                    ei=mid-1;
                }
                mid=(ei+si)/2;
                
            }
            if(si>ei){
                System.out.println("Element is not found ");
            }
            }
    public static void main(String[] args) {
        int arr[]={1,2,2,2,5,6,7,8,9,10,11,12,13,14,15};
        int key=6;
        int ei=arr.length-1;
        binarysearch(arr,0,ei,key);
        lowerBound(arr,0,ei,2);




       
    }

    
    
}
