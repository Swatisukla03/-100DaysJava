package Day4;

public class sortByMethod {
    public static void main(String[] args) {
        int []arr=new int[]{78,45,67,-3,-67,19,81};
        System.out.println("Array elements after sorting :");

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=0;
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                }
                System.out.print(arr[i]+" ");
            }
        }
    }
    

