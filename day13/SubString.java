package day13;

public class SubString {
    public static void main(String[] args) {
        String s1="hello";
        // String s2[]=s1.split(" ");
        // System.out.println(s2[]);
        // System.out.println(s1.substring());
        for(int i=0;i<=s1.length()-1;i++){
            for(int j=i;j<=s1.length()-1;j++){
                // for(int)
                System.out.println(s1.substring(i,j+1));

            }
            // System.out.println();
           


        }

    }
    
}
