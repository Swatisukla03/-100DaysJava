package Day4;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        String s="This is my World";
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a String :");
        // s=sc.nextLine(); //reading from user
        System.out.println("After reversing the String :");
        for(int i=s.length();i>0;i--){
            System.out.print(s.charAt(i-1));
        }

    }
    
}
