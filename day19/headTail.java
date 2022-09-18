package day19;

public class headTail {
    public static void main(String[] args) {
        headTail(3,"");

        
    }
    public static void headTail(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;

        }
        else{
            

            headTail(n-1, ans+"H");
            headTail(n-1,ans+"T");
            // System.out.println(n);
            



        }

    }
    
}
