package day15;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class recursionsolve {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int i=sc.nextInt();
        // int n=sc.nextInt();
        // pd(5);
        // pd1(5);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=sum(n);
        System.out.println(sum);

        


    }

    // public static void pd(int n) {
    //     // if (n == 1) {
    //     //     System.out.println(1);
    //     if (n==1 ) {
    //         System.out.println(1);
    //     } else {
    //         // pd(n - 2);
    //         // System.out.println(n-1);
    //         // System.out.println(n);
    //         // System.out.println(n);
    //         // System.out.println(n-1);
    //         // pd( n-1);
    //         // System.out.println(n);



             
    //     }
    // }
    public static int sum(int n) {
      if(n==1){
          return 1;
      }
      else{
          return(n+sum(n-1));
      }
    }
}


