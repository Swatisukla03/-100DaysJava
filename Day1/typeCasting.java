public class typeCasting {
    public static void main(String[] args) {
        // int num1=75;
        // int num2=120;
        // char a=(char)num1;
        // char b=(char)num2;
        // System.out.println(a);
        // System.out.println(b);
        // }

        // convert string to number

        // create a string variable
    //     String str1 = "Programiz";

    //     // convert string to int
    //     // using parseInt()
    //     int num1 = Integer.parseInt(str1);

    //     // print int values
    //     System.out.println(num1); // throws NumberFormatException
    // }
    //op-throws an error
    String str1="546";
    String str2="1345";
    int num1=Integer.valueOf(str1);
    int num2=Integer.valueOf(str2);
    System.out.println(num1);
    System.out.println(num2);
    // System.out.println();
    }
}
