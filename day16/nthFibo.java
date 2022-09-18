package day16;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class nthFibo {
    public static void main(String[] args) {
         
    
       
        // System.out.println(Fibo(8));
        System.out.println(tailpow(2, 5, 1));
        System.out.println(tailFibo(8,0,1));
        
    }
    public static int Fibo(int n){
        // if(n==0){
        //     return 0;
        // }
        // if(n==1){
        //     return 1;
        // }
        if(n==1 || n==0){
            return n;
        }
        int fibonm2=Fibo(n-2);
        int fibonm1=Fibo(n-1);
        int fibon=fibonm1+fibonm2;
        return fibon;
      
        // return xn;
    }
    public static int tailFibo(int a,int b ,int n){
       
        if(n==0){
            return a;
        }
        else{
            return tailFibo(b,a+b,n);
        }


        // int fibonm2=Fibo(n-2);
        // int fibonm1=Fibo(n-1);
        // int fibon=fibonm1+fibonm2;
        // return fibon;
        // int c=a+b;
        // return c;
      
        // return xn;
    }

    public static int tailpow(int a,int b,int ans){
        if(b==0){
            return ans;
        }
        return tailpow(a, b-1, a*ans);
    }
    
}

    

