
package day7;

public class subArray {
    public static void main(String[] args) {
        subArray sArr=new subArray();
        int arr[]= {1,-2,3,4,-5,6,-7,-8,9,-100,10};
        sArr.printSubArray(arr);
        System.out.println("-------------------");
        sArr.MaxSum(arr);
        
    }
    
  

void printSubArray(int arr[]){
    int n=arr.length;
    for(int i=0;i<arr.length;i++){
        int sum=0;
        for(int j=i;j<arr.length;j++){
            System.out.print(arr[j]+" ");
            sum=sum+arr[j];


           

            // for(int k=i;k<=j;k++){
            //     System.out.print(arr[k]+" ");
            //     sum=sum+arr[k];
            // }
            // System.out.println(arr[j]);
            System.out.println();
            System.out.println(sum);
           
            
        }
         
    }

}
 public static void MaxSum(int arr[]){
     int max=Integer.MIN_VALUE;
    int n=arr.length;
    for(int i=0;i<arr.length;i++){
        int sum=0;
        for(int j=i;j<arr.length;j++){
            // System.out.print(arr[j]+" ");

            sum=sum+arr[j];
            if(max<sum){
                max=sum;
            }
        }
            System.out.println(max);




            

           

            // for(int k=i;k<=j;k++){
            //     System.out.print(arr[k]+" ");
            //     sum=sum+arr[k];
            // }
            // System.out.println(arr[j]);
            // System.out.println();
            // System.out.println(sum);
           
            
        }
        
         
    }
    public static void kadanes(int arr[]){
        int max=Integer.MIN_VALUE;
        int sum=0;
    //    int n=arr.length;
       for(int i=0;i<arr.length;i++){
        //    int sum=0;
             sum+=i;
             if(sum>max){
                 max=sum;

             }
             if(sum<0){
                 sum=0;

             }
            }
           
               System.out.println(max);
               
   
              
   
               // for(int k=i;k<=j;k++){
               //     System.out.print(arr[k]+" ");

               //     sum=sum+arr[k];
               // }
               // System.out.println(arr[j]);
               // System.out.println();
               // System.out.println(sum);

              
               
           }
            
       }


