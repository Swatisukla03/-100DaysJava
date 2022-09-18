package day16;

import java.util.Scanner;

public class linearPow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
       
        System.out.println(linearpow(x, n));
        
    }
    public static int linearpow(int x,int n){
        if(n==0){
            return 1;
        }
        // int xnm1=linearpow(x, n-1);
        int xn=x*linearpow(x, n-1);
        return xn;
    }
    
}
