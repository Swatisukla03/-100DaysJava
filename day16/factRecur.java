package day16;

import java.util.Scanner;

public class factRecur {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        System.out.println(fact(n));  
        
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
         
        int factn=n*fact(n-1);
        return factn;
    }
    
}
