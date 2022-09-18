package Practice7;

import java.util.Scanner;

import day13.string;

public class ScannerClass {
    public static void main(String args[]){
        Scanner myobj=new Scanner(System.in);
        String username;
        System.out.println("Enter username");
        username=myobj.nextLine();
        System.out.println("Username is :"+username);
    }
    
}
