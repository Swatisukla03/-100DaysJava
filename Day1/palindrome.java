public class palindrome {
    public static void main(String[] args) {
        // Palindrome
        // 121
        //

        // String str = "Radar", reverseStr = "";

        // int strLength = str.length();

        // for (int i = (strLength - 1); i >=0; --i) {
        // reverseStr = reverseStr + str.charAt(i);
        // }

        // if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
        // System.out.println(str + " is a Palindrome String.");
        // }
        // else {
        // System.out.println(str + " is not a Palindrome String.");
        // }
        // }
        // }
        // Method-2
        int num = 1551, reverseNum = 0, remainder;
        int originalNum = num;
        while (num != 0) {
            remainder = num % 10;
            reverseNum = reverseNum * 10 + remainder;
            num /= 10;

        }
        if (originalNum == reverseNum) {
            System.out.println(originalNum + "is Palindrome.");
        } else {
            System.out.println(originalNum + "is not Palindrome");
        }
    }

}
