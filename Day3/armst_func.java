package Day3;

public class armst_func {
    public static void main(String[] args) {
        printAllArmStrong(1000);
    }
    public static int countDigit(int n){
        //counting the digits
        int d=(int)Math.log10(n)+1;
        return d;
    }
    public static boolean isArmstrong(int n){
        int d=countDigit(n);
        int sum=0;
        int t=n;
        while(n!=0){
            int rem=n%10;
            sum=sum+(int)Math.pow(rem,d);
            n=n/10;

        }
         return sum==t;
    }
    public static void printAllArmStrong(int n){
        for(int i=1;i<=n;i++){

            if(isArmstrong(i)){
                
                System.out.println(i);
            }
        }
    }
    
}
