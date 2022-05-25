package Day4;
// here we are going to find third largest no

public class ThirdLarge {
    public static int getThirdLargest(int[] a,int total){
        int temp;
        for(int i=0;i<total;i++){
            for( int j=i+1;j<total;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
        }
        return a[total-3];
    }




    public static void main(String[] args) {
        int a[]={1,2,5,6,3,2};
        int b[]={44,55,66,77,88};
        System.out.println("Third Largest : "+getThirdLargest(a,6));
        System.out.println("Third Largest :"+getThirdLargest(a, 7));

        
    }
    
}
