package day19;

public class subsequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printSS(str, "");                                            //1
      }''
    
      public static void printSS(String ques, String ans) {
        if (ques.length() == 0) {                                  //2
          System.out.println(ans);
          return;
        }
    
        char ch = ques.charAt(0);                                   //3
        String roq = ques.substring(1);                             //4
        printSS(bc, ans + ch);                                      //5
        printSS(bc, ans + "");                                      //6
      }
    }
         
