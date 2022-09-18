package practice.practiceD6;

public class maxinele {
  
    public static void main(String[] args) {
        int arr[]={1,5,8,9,12,56,7,2};
        int max_element=maxele(arr, 0);
        System.out.println(max_element);

        
        
    }
    public static int maxele(int arr[],int i){
        if(i==arr.length-1){
            return arr[i];
        }
        else{
            int max_ele_n=maxele(arr, i+1);
            if(arr[i]<max_ele_n){
                return max_ele_n;
            }else{
                return arr[i];

            }
        }

    }
    
}
